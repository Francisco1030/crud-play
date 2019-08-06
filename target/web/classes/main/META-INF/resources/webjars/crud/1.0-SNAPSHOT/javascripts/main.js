M.AutoInit();
$('.dropdown-button').dropdown({
    container: document.body,
    coverTrigger: false,
    inDuration: 300,
    outDuration: 225
});

$( document ).ready(function() {
    $('.sidenav').sidenav();
    $('.tooltipped').tooltip();
    $('.modal').modal();
});
