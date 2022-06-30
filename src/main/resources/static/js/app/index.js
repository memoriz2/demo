var fn = {
    init : function() {
        var _this = this;
        $('#btn-save').on('click',function(){
            var data = {};
            $('#myform').serializeArray().map(function(x){data[x.name] = x.value;});
            _this.save(data);
        });
    },
    save : function(data){
        $.ajax({
            type: 'POST'
            , url: '/api/m1/board/save'
            , dataType: 'json'
            , contentType: 'application/json; charset=utf-8'
            , data: JSON.stringify(data)
        }).done(function() {
            alert('게시글이 등록되었습니다.');
            window.location.href = '/';
        }).fail(function(error) {
            alert(JSON.stringify(error));
        });
    }
}
fn.init();