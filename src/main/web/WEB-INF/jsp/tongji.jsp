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
    <li><a href="">首页</a></li>
    <li><a href="">功能介绍</a><li>
    <li><a href="">个人中心</a></li>
    <li><a href="">你好，aaaa</a></li>
    <li><a href="">注销</a></li>
</div>
<div id="content">
    <div id="list">
        <div id="title">
            账号管理
        </div>
        <div id="tlist">
            <li><a href="/index">个人资料</a></li>
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
            <table class="table table-bordered" style="width: 65vw;">
                <thead>
                <tr>
                    <th>名称</th>
                    <th>描述</th>
                    <th>得票数</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
               <c:forEach items="${xuan}" var="xx">
                   <tr>
                       <td style="width: 5vw">${xx.xname}</td>
                       <td style="word-break : break-all; overflow:hidden;width: 50vw">${xx.xcontent}</td>
                       <td style="width:6vw">${xx.xcount}</td>
                       <td>
                           <button type="button" class="btn btn-primary">编辑</button>
                           <button type="button" class="btn btn-danger">删除</button>
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
</script>
</html>
