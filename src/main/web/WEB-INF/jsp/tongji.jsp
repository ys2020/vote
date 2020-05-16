<%--
  Created by IntelliJ IDEA.
  User: 羊来
  Date: 2020/5/13
  Time: 16:04
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
<div id="content">
    <div id="list">
        <div id="title">
            账号管理
        </div>
        <div id="tlist">
            <li><a href="/userinfo">个人资料</a></li>
            <li><a href="/huati">创建投票</a></li>
            <li><a href="/guanli">活动管理</a></li>
            <li><a href="/tongji">数据统计</a></li>
        </div>
    </div>
    <div id="form" style="width: 65vw">
        <div id="top">
            <a href="">数据统计</a><p style="width: 100%;"><hr ></p>
        </div>
        <div id="info">
            <select id="xiala">
                <c:forEach items="${hua}" var="hh">
                <option value="${hh.hid}">${hh.hname}</option>
                </c:forEach>
            </select>
            <input type="button" name=""  class="btn btn-primary" onclick="getxuan()" value="查看">
            <table class="table table-bordered" style="width: 65vw;">
                <thead>
                <tr>
                    <th>名称</th>
                    <th>描述</th>
                    <th>得票数</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody id="tbody">

                </tbody>
            </table>
        </div>
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
    $("#xiala option:first").prop("selected", 'selected');

    function getxuan(){
        var hid=$("#xiala option:selected").val();
        $.ajax({
            url: "/getxuan",
            type: "get",
            dataType: "json",
            data: {
                "hid": hid
            },
            success: function (data) {
                var str=""
                $.each(data,function (index,item) {
                    str+='<tr id="xuan'+item.xid+'">'
                    str+='<td style="width: 5vw">'+item.xname+'</td>'
                    str+='<td style="word-break : break-all; overflow:hidden;width: 50vw">'+item.xcontent+'</td>'
                    str+='<td style="width:6vw">'+item.xcount+'</td>'
                    str+='<td>'
                    str+='<button type="button" class="btn btn-primary">编辑</button>'
                    str+='<button type="button" class="btn btn-danger" onclick="delxuan('+item.hid+','+item.xid+')">删除</button>'
                    str+='</td>'
                    str+='</tr>'
                });
                $("#tbody").html(str);
            }
        });
    }
    function delxuan(hid,xid){
        var str ="#xuan"+xid;
        var xuan=$(str);
        if (confirm("是否删除该话题？")){
            $.ajax({
                url: "/delxuan",
                type: "get",
                dataType: "json",
                data: {
                    "hid": hid,
                    "xid": xid
                },
                success: function (data) {
                    alert("删除成功");
                    xuan.remove()
                }
            });
        }
    }

</script>
</html>
