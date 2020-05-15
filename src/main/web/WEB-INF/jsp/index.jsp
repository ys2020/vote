<%--
  Created by IntelliJ IDEA.
  User: 羊来
  Date: 2020/5/13
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../statics/css/nav.css"/>
    <link rel="stylesheet" type="text/css" href="../../statics/css/bootstrap.css"/>
    <script src="../../statics/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div class="nav-top">
    <li><a href="/userinfo">个人中心</a></li>
    <li><a href="">你好，${userSession.uname}</a></li>
    <li><a href="/logout">注销</a></li>
</div>
<div class="dovote">
    <p style="font-size: 30px;">-----------投票系统--------</p>
    <p style="font-size: 16px;color: greenyellow;">活动介绍：${huati.hname}</p>
    <p style="font-size: 16px;color: greenyellow;">活动介绍：${huati.content}</p>
    <div id="vote">
        <c:forEach items="${xuans}" var="xx">
            <div class="col-md-3" style="width: 280px">
                <input type="hidden" id="xid${xx.xid}" value="${xx.xid}">
                <p style="text-align: center">${xx.xname}</p>
                <span style="text-align: center">${xx.xcontent}</span>
                <p><button type="button" class="btn btn-primary" onclick="Dovote(${xx.xid})">投票</button></p>
                <span id="xcount${xx.xid}" style="text-align: center">${xx.xcount}</span>
            </div>
        </c:forEach>
    </div>
</div>
</body>
<script src="../../statics/js/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    $("#tlist a").hover(function(){
        $(this).css("background-color","yellow");
    },function(){
        $(this).css("background-color","#fff");
    });
    var hid=${huati.hid};
    function Dovote(xid){
        var msg='确定要投票吗？';
        xcount="#xcount";
        xcount+=xid;
        var count=this.$(xcount);
        if (confirm(msg)) {
            $.ajax({
                url: "/addvote",
                type: "post",
                dataType: "json",
                data: {
                    "id": xid,
                    "hid": hid
                },
                success: function (data) {
                    count.text(data.xcount);
                }
            });
        }
    }
</script>
</html>

