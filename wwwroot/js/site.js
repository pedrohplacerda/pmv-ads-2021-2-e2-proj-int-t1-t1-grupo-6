$(document).on('keypress', '.mascara-Preco', function () {
    return validaPreco(this);
});


function validaPreco(componente) {
    var quantidadeCasasDepoisVirgula = 0;
    var posicaoVirgula = $(componente).val().indexOf(',');
    var quantidadeCaracteres = $(componente).val().length;
    var caracteresAposVirgula = "";

    try {
        quantidadeCasasDepoisVirgula = $(componente).val().split(',')[1].length;
        caracteresAposVirgula = $(componente).val().substr($(componente).val().indexOf(',') + 1, $(componente).val().length);
    }
    catch (e) {
        quantidadeCasasDepoisVirgula = 0;
    }

    if (event.keyCode == 44) {
        if (quantidadeCaracteres == 0 || window.getSelection().toString() == $(componente).val() || posicaoVirgula != -1 || componente.selectionEnd == 0) {
            if ($(componente).val() != window.getSelection().toString()) {
                if (window.getSelection().toString().indexOf("," + caracteresAposVirgula) != -1) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else {
            if (componente.selectionEnd >= $(componente).val().length - 2) {
                return true;
            }
            else {
                return false;
            }
        }
    }
    else {
        if (event.keyCode > 47 && event.keyCode < 58) {
            if (quantidadeCasasDepoisVirgula < 2 || window.getSelection().toString() == $(componente).val()) {
                return true;
            }
            else {
                if (componente.selectionEnd < $(componente).val().length - 2) {
                    return true;
                }
                else {
                    if (window.getSelection().toString() != "" && componente.selectionEnd > $(componente).val().length - 2) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        else {
            return false;
        }
    }
}

function actionFormaterPreco(value, row, index) {
    console.log(value);
    if (value != null) {
        return value.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
    }

    return '-';
}

function ShowLoading() {
    $('#corpo').css('opacity', '0.4');
    $('#loading').show();
}

function HideLoading() {
    $('#corpo').css('opacity', '1');
    $('#loading').hide();
}