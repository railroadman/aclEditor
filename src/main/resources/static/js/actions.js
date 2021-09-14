var selected = new Array();
jQuery(document).ready(function($) {
    $('#search').multiselect({
        search: {
            left: '<input type="text" autocomplete="off" id="search_el" name="q" class="form-control" placeholder="Search..." />',
            right: '<input type="text" autocomplete="off" id="found_el" name="q_out" class="form-control" placeholder="Search..." />',
        },
        fireSearch: function(value) {
            return value.length > 0;
        }
    });

    $("#search_el").on("click",function(){
        var press = jQuery.Event("keypress");
        press.ctrlKey = false;
        press.which = 8;
    $(this).trigger(press);

        console.log("here");
    });

    $("#do_create").on("click",function(){
        var id = $("#input_id").val();
        var code = $("#input_code").val();
            selected = [];
        $("#search_to option").each(function(){
            selected.push($(this).val())

        });
        var data = { "id":id,"code":code,"permissions":selected};
        console.log(data);
        $.ajax({
            url: '/do/create',
            type: 'POST',
            data: JSON.stringify(data),
            contentType: 'application/json; charset=utf-8',
            dataType: 'json',
            async: false,
            success: function(msg) {
                console.log(msg);
            }
        });




    })

});
