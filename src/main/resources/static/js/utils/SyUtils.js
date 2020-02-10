
$.extend($.fn.datagrid.defaults.editors, {
    datetimebox: {
        init: function (container, options) {
            var input = $('<input>').appendTo(container);
            input.editable = false;
            input.datetimebox(options);
            return input;
        },
        destroy: function (target) {
            $(target).datetimebox('destroy');
        },
        getValue: function (target) {
            return $(target).datetimebox('getValue');
        },
        setValue: function (target, value) {
            $(target).datetimebox('setValue');
        },
        resize: function (target, width) {
            $(target).datetimebox('resize', width);
        }
    }
});

function getId(length) {
    return Number(Math.random().toString(length));
}