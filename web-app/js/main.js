$(function() {
    
    // ajax search
    $('#search_form').submit(function() {
        var data = $(this).serialize();
        
        $.post('http://localhost:8080/grails-geb-demo/book/search', data, function(data) {
            var container = $('#search_results');
            
            container.empty();
            
            if (data.error == 'no results') {
                $('<p>No Results!</p>').appendTo(container).delay(2000).fadeOut();
            } else {
                var retval = '<ul>';
                
                $.each(data, function() {
                    retval += '<li><a href="http://localhost:8080/grails-geb-demo/book/' + this.id + '">' + this.title + ' by ' + this.author + '</a></li>';
                });
                
                retval += '</ul>';
                
                $(retval).appendTo(container);
            }
        });
        
        return false;
    });
    
});