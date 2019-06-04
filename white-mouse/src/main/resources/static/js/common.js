function sendPostToken(url,params,callBack,token) {
    $.ajax({
        type: "POST",
        url: url,
        data: JSON.stringify(params) ,
        dataType: "json",
        contentType: "application/json",
        beforeSend: function (XMLHttpRequest) {
            XMLHttpRequest.setRequestHeader("token", token);
        },
        success: function (data) {
            callBack(data);
        },
        error: function (XMLHttpRequest) {
            sweetAlert("服务忙，请重试", "", "error");
        }
    });
}

function sendPost(url,params,callBack) {
    $.ajax({
        type: "POST",
        url: url,
        data: JSON.stringify(params) ,
        dataType: "json",
        contentType: "application/json",
        success: function (data) {
            callBack(data);
        },
        error: function (XMLHttpRequest) {
            sweetAlert("服务忙，请重试", "", "error");
        }
    });
}

function sendGet(url,callBack) {
    $.ajax({
        type: "GET",
        url: url,
        dataType: "json",
        contentType: "application/json",
        success: function (data) {
            callBack(data);
        },
        error: function (XMLHttpRequest) {
            sweetAlert("服务忙，请重试", "", "error");
        }
    });
}