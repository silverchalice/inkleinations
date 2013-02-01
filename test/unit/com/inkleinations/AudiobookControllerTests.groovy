package com.inkleinations



import org.junit.*
import grails.test.mixin.*

@TestFor(AudiobookController)
@Mock(Audiobook)
class AudiobookControllerTests {


    def populateValidParams(params) {
      assert params != null
      // TODO: Populate valid properties like...
      //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/audiobook/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.audiobookInstanceList.size() == 0
        assert model.audiobookInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.audiobookInstance != null
    }

    void testSave() {
        controller.save()

        assert model.audiobookInstance != null
        assert view == '/audiobook/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/audiobook/show/1'
        assert controller.flash.message != null
        assert Audiobook.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/audiobook/list'


        populateValidParams(params)
        def audiobook = new Audiobook(params)

        assert audiobook.save() != null

        params.id = audiobook.id

        def model = controller.show()

        assert model.audiobookInstance == audiobook
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/audiobook/list'


        populateValidParams(params)
        def audiobook = new Audiobook(params)

        assert audiobook.save() != null

        params.id = audiobook.id

        def model = controller.edit()

        assert model.audiobookInstance == audiobook
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/audiobook/list'

        response.reset()


        populateValidParams(params)
        def audiobook = new Audiobook(params)

        assert audiobook.save() != null

        // test invalid parameters in update
        params.id = audiobook.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/audiobook/edit"
        assert model.audiobookInstance != null

        audiobook.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/audiobook/show/$audiobook.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        audiobook.clearErrors()

        populateValidParams(params)
        params.id = audiobook.id
        params.version = -1
        controller.update()

        assert view == "/audiobook/edit"
        assert model.audiobookInstance != null
        assert model.audiobookInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/audiobook/list'

        response.reset()

        populateValidParams(params)
        def audiobook = new Audiobook(params)

        assert audiobook.save() != null
        assert Audiobook.count() == 1

        params.id = audiobook.id

        controller.delete()

        assert Audiobook.count() == 0
        assert Audiobook.get(audiobook.id) == null
        assert response.redirectedUrl == '/audiobook/list'
    }
}
