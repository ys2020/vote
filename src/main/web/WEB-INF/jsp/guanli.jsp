<%--
  Created by IntelliJ IDEA.
  User: 羊来
  Date: 2020/5/13
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <div id="form">
        <div id="top">
            <a href="">活动管理</a><p style="width: 100%;"><hr ></p>
        </div>
        <div id="info">
            <table class="table table-bordered" style="width: 67vw;">
                <thead>
                <tr>
                    <th>名称</th>
                    <th>活动内容</th>
                    <th>开始时间</th>
                    <th>截至时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody id="tbody">
                <c:forEach items="${ht}" var="hh">
                    <tr id="hua${hh.hid}">
                        <td  style="word-break : break-all; overflow:hidden;">${hh.hname}</td>
                        <td  style="word-break : break-all; overflow:hidden; ">${hh.content}</td>
                        <td style="width: 7vw;">${hh.starttime}</td>
                        <td style="width: 7vw;">${hh.endtime}</td>
                        <td>
                            <button type="button" class="btn btn-primary" onclick="location.href='/select/${hh.hid}'">查看</button>
                            <button type="button" class="btn btn-danger" onclick="Del(${hh.hid})">删除</button>
                        </td>
                    </tr>
                </c:forEach>

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
    function Del(hid){
        var str ="#hua"+hid;
        var hua=$(str);
        if (confirm("是否删除该话题？")){
            $.ajax({
                url: "/delhuati",
                type: "get",
                dataType: "json",
                data: {
                    "hid": hid
                },
                success: function (data) {
                    alert("删除成功");
                    hua.remove()
                }
            });
        }
    }
</script>
</html>
