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

$(function(){
    $("#form-pessoa").validate({
        rules: {
            nome: {
                required: true,
                minlength: 3,
                maxlength: 10
            },
            email:{
                required: true,
                email: true
            }
        },
        messages: {
            nome: {
                required: "Informe o nome!",
                minlength: "Deve ter no mínimo 3 letras!",
                maxlength: "Deve ter no máximo 10 letras!"
            },
            email: {
                required: "Informe o E-mail!",
                email: "Informe um E-mail válido!"
            }
        }
    });
    $("#form-endereco").validate({
        rules: {
            rua: {
                required: true,
                minlength: 3,
                maxlength: 10
            },
            numero:{
                required: true,
                minlength: 1,
                maxlength: 10
            }
        },
        messages: {
            rua: {
                required: "Informe o rua!",
                minlength: "Deve ter no mínimo 3 letras!",
                maxlength: "Deve ter no máximo 10 letras!"
            },
            numero: {
                required: "Informe o número!",
                minlength: "Deve ter no mínimo 1 letras!",
                maxlength: "Deve ter no máximo 10 letras!"
            }
        }
    });

    jQuery.validator.addMethod(
        "select",
        function(value, element) {
            if (element.value == "") {
                return false;
            }
            else return true;
        },
        "Please select an option."
    );
});

$(document).ready(function () {
    $('#tabela-paginacao').DataTable({
        "language":{
            "sEmptyTable": "Nenhum registro encontrado",
            "sInfo": "Mostrando de _START_ até _END_ de _TOTAL_ registros",
            "sInfoEmpty": "Mostrando 0 até 0 de 0 registros",
            "sInfoFiltered": "(Filtrados de _MAX_ registros)",
            "sInfoPostFix": "",
            "sInfoThousands": ".",
            "sLengthMenu": "_MENU_ ",
            "sLoadingRecords": "Carregando...",
            "sProcessing": "Processando...",
            "sZeroRecords": "Nenhum registro encontrado",
            "sSearch": "Pesquisar",
            "oPaginate": {
                "sNext": "Próximo",
                "sPrevious": "Anterior",
                "sFirst": "Primeiro",
                "sLast": "Último"
            },
            "oAria": {
                "sSortAscending": ": Ordenar colunas de forma ascendente",
                "sSortDescending": ": Ordenar colunas de forma descendente"
            }
        }
    });
});