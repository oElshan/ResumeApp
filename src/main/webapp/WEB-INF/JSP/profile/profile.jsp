
<%--<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%--<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>--%>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>--%>
<%--<!DOCTYPE html>--%>
<%--<head>--%>
    <%--<meta charset="utf-8">--%>
    <%--<meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
    <%--<title>Resume</title>--%>
    <%--<link href="../../../static/css/bootstrap.css" rel="stylesheet">--%>
    <%--<link href="../../../static/css/bootstrap-theme.css" rel="stylesheet">--%>
    <%--<link href="../../../static/css/font-awesome.css" rel="stylesheet">--%>
    <%--<link href="../../../static/css/app.css" rel="stylesheet">--%>
<%--</head>--%>
<%--<body>--%>
<%--<nav class="navbar navbar-default ">--%>
    <%--<div class="container-fluid headresume">--%>
        <%--<!-- Brand и toggle сгруппированы для лучшего отображения на мобильных дисплеях -->--%>
        <%--<div class="navbar-header">--%>
            <%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">--%>
                <%--<span class="sr-only">Toggle navigation</span>--%>
                <%--<span class="icon-bar"></span>--%>
                <%--<span class="icon-bar"></span>--%>
                <%--<span class="icon-bar"></span>--%>
            <%--</button>--%>
            <%--<a class="navbar-brand" href="#">Resume</a>--%>
        <%--</div>--%>

        <%--<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">--%>
            <%--<form class="navbar-form navbar-left">--%>
                <%--<div class="form-group">--%>
                    <%--<input type="text" class="form-control" placeholder="Search">--%>
                <%--</div>--%>
                <%--<button type="submit" class="btn btn-default">Search</button>--%>
            <%--</form>--%>
            <%--<ul class="nav navbar-nav navbar-right">--%>
                <%--<li><a href="#">Link</a></li>--%>
                <%--<li class="dropdown">--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="#">Action</a></li>--%>
                        <%--<li><a href="#">Another action</a></li>--%>
                        <%--<li><a href="#">Something else here</a></li>--%>
                        <%--<li role="separator" class="divider"></li>--%>
                        <%--<li><a href="#">Separated link</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
            <%--</ul>--%>
        <%--</div><!-- /.navbar-collapse -->--%>
    <%--</div>--%>
<%--</nav>--%>
<div class="container profile">
    <main>
        <div class="row">
            <!---------------------------------------------------------->
            <div class="col-lg-4 col-sm-6 col-md-4">
                <div class="panel panel-default" >
                    <div class="panel-body avatar">
                        <!--<div class="row  center-block ">-->
                        <!----
                     <!--</div>-->
                        <a href="#" class="thumbnail avatarimg ">
                            <img src="media/Java.png"   alt="..."  >
                        </a>
                        <div class="row ">
                            <h3 class="text-center ">Elshan Orudzhov</h3>
                            <h6 class="text-center initialism">Moscow , Russia</h6>
                            <h6 class="text-center "> Age: 29 , Birthday : 03 june 2019 </h6>

                        </div>


                        <ul class="list-group">
                            <li class="list-group-item phone-number">
                                <i class="fa fa-phone" aria-hidden="true"></i>
                                phone
                            </li>
                            <li class="list-group-item">
                                <i class="fa fa-envelope-o" aria-hidden="true"></i>
                                DQWDDQ@ya.ru</li>

                            <li class="list-group-item">
                                <i class="fa fa-skype" aria-hidden="true"></i>
                                skype
                            </li>
                            <li class="list-group-item">
                                <i class="fa fa-facebook" aria-hidden="true"></i>
                                facebook </li>
                            <li class="list-group-item">
                                <i class="fa fa-github" aria-hidden="true"></i>
                                github</li>
                        </ul>
                    </div>
                </div>
                <!--Languages-->
                <div class="panel panel-primary objective"  >
                    <div class="panel-heading ">
                        <i class="fa fa-language" aria-hidden="true"></i>
                        <span>Languages</span>
                        <a href="#" class="edit">
                            <i class="fa fa-pencil" aria-hidden="true"></i>Edit</a>
                    </div>
                    <div class="panel-body">
                    </div>
                </div>
                <!--Hobbi-->
                <div class="panel panel-primary objective"  >
                    <div class="panel-heading ">
                        <i class="fa fa-heart" aria-hidden="true"></i>
                        <span>Hobbi</span>
                        <a href="#" class="edit">
                            <i class="fa fa-pencil" aria-hidden="true"></i>Edit</a>
                    </div>
                    <div class="panel-body">
                    </div>
                </div>
            </div>


            <!---------------------------------------------------------->
            <div class="col-lg-8 col-sm-6 col-md-8">
                <!--Objective-->
                <div class="panel panel-primary objective"  >
                    <div class="panel-heading ">
                        <i class="fa fa-bullseye" aria-hidden="true"></i>
                        <span>Objective</span>
                        <a href="#" class="edit">
                            <i class="fa fa-pencil" aria-hidden="true"></i>Edit</a>
                    </div>
                    <div class="panel-body">
                    </div>
                </div>
                <!--Technical Skills-->
                <div class="panel panel-primary technical-skills"  >
                    <div class="panel-heading">
                        <i class="fa fa-code" aria-hidden="true"></i>
                        <span>Technical Skills</span>
                        <a href="#" class="edit">
                            <i class="fa fa-pencil" aria-hidden="true"></i>Edit</a>
                    </div>
                    <div class="panel-body">
                        <table class="table table-bordered">
                            <tr>
                                <th>
                                    Category
                                </th>
                                <th>Frameworks and technologies
                                </th>
                            <tr>
                                <td>
                                    Languages
                                </td>
                                <td>
                                    ????
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Java
                                </td>
                                <td>
                                    ????
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    IDE
                                </td>
                                <td>
                                    ????
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    CVS
                                </td>
                                <td>
                                    ????
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Web Servers
                                </td>
                                <td>
                                    ????
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Build system
                                </td>
                                <td>
                                    ????
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Cloud
                                </td>
                                <td>
                                    ????
                                </td>
                            </tr>

                        </table>
                    </div>
                </div>
                <!--Practic Experience-->
                <div class="panel panel-primary"  >
                    <div class="panel-heading">
                        <i class="fa fa-briefcase" aria-hidden="true"></i>
                        <span>Practic Experience</span>
                        <a href="#" class="edit">
                            <i class="fa fa-pencil" aria-hidden="true"></i>Edit</a>
                    </div>
                    <div class="panel-body">
                        Panel content
                    </div>
                </div>
                <!--Certificates-->
                <div class="panel panel-primary"  >
                    <div class="panel-heading">
                        <i class="fa fa-certificate" aria-hidden="true"></i>
                        <span>Certificates</span>
                        <a href="#" class="edit">
                            <i class="fa fa-pencil" aria-hidden="true"></i>Edit</a>
                    </div>
                    <div class="panel-body">
                        Panel content
                    </div>
                </div>
                <!--Courses-->
                <div class="panel panel-primary"  >
                    <div class="panel-heading">
                        <i class="fa fa-book" aria-hidden="true"></i>
                        <span>Courses</span>
                        <a href="#" class="edit">
                            <i class="fa fa-pencil" aria-hidden="true"></i>Edit</a>
                    </div>
                    <div class="panel-body">
                        Panel content
                    </div>
                </div>
                <!--Education-->
                <div class="panel panel-primary"  >
                    <div class="panel-heading">
                        <i class="fa fa-book" aria-hidden="true"></i>
                        <span>Education</span>
                        <a href="#" class="edit">
                            <i class="fa fa-pencil" aria-hidden="true"></i>Edit</a>
                    </div>
                    <div class="panel-body">
                        Panel content
                    </div>
                </div>


            </div>
        </div>

    </main>


    <footer>
        This is footer
    </footer>
</div>

<%--<script src="../../../static/js/jquery.js"></script>--%>
<%--<script src="../../../static/js/bootstrap.js"></script>--%>
<%--<script src="../../../static/js/app.js"></script>--%>
<%--</body>--%>
<%--</html>--%>