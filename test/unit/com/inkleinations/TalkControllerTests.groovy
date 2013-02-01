package com.inkleinations



import org.junit.*
import grails.test.mixin.*

@TestFor(TalkController)
@Mock(Talk)
class TalkControllerTests {


    def populateValidParams(params) {
      assert params != null
      // TODO: Populate valid properties like...
      //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/talk/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.talkInstanceList.size() == 0
        assert model.talkInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.talkInstance != null
    }

    void testSave() {
        controller.save()

        assert model.talkInstance != null
        assert view == '/talk/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/talk/show/1'
        assert controller.flash.message != null
        assert Talk.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/talk/list'


        populateValidParams(params)
        def talk = new Talk(params)

        assert talk.save() != null

        params.id = talk.id

        def model = controller.show()

        assert model.talkInstance == talk
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/talk/list'


        populateValidParams(params)
        def talk = new Talk(params)

        assert talk.save() != null

        params.id = talk.id

        def model = controller.edit()

        assert model.talkInstance == talk
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/talk/list'

        response.reset()


        populateValidParams(params)
        def talk = new Talk(params)

        assert talk.save() != null

        // test invalid parameters in update
        params.id = talk.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/talk/edit"
        assert model.talkInstance != null

        talk.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/talk/show/$talk.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        talk.clearErrors()

        populateValidParams(params)
        params.id = talk.id
        params.version = -1
        controller.update()

        assert view == "/talk/edit"
        assert model.talkInstance != null
        assert model.talkInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/talk/list'

        response.reset()

        populateValidParams(params)
        def talk = new Talk(params)

        assert talk.save() != null
        assert Talk.count() == 1

        params.id = talk.id

        controller.delete()

        assert Talk.count() == 0
        assert Talk.get(talk.id) == null
        assert response.redirectedUrl == '/talk/list'
    }
}
