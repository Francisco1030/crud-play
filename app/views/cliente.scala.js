
$(function() {

    var websocket = new WebSocket("@routes.HomeController.socket().webSocketURL(request)")

    // $("#talk").keypress(enviaMensagemEnter)
    // websocket.onmessage = receiveEvent
})