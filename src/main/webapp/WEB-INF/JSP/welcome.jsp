
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
    <%--<meta charset="UTF-8">--%>
    <%--<title>Title</title>--%>
    <%--<link href="../../static/css/bootstrap.css" rel="stylesheet">--%>
    <%--<link href="../../static/css/bootstrap-theme.css" rel="stylesheet">--%>
    <%--<link href="../../static/css/font-awesome.css" rel="stylesheet">--%>
    <%--<link href="../../static/css/app.css" rel="stylesheet">--%>

<%--</head>--%>
<%--<body>--%>

<div class="container">
    <div class="row">
        <div class="jumbotron">
            <h1>Welcome to the Resume!</h1>
            <p class="lead">You can create your account in 10 clicks!</p>
            <p class="lead">Find new employees for your company.</p>
            <a class="btn btn-primary"  href="#regWindow" id="registration">Sign in</a>

        </div>
    </div>
    <div class="modal fade" id="regWindow" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header req-window">
                    <!--todo добавить значок -->
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title " id="myModalLabel">Укажите ваши перcональные данные</h4>
                </div>

                <div class="modal-body">
                    <form class="req-form"method="get">
                        <div class="form-group">
                            <label for="name">Имя</label>
                            <input type="email" class="form-control" id="name" placeholder="Имя">
                        </div>
                        <div class="form-group">
                            <label for="secondName">Фамилия</label>
                            <input type="password" class="form-control" id="secondName" placeholder="Фамилия">
                        </div>
                        <div class="form-group">
                            <label for="password">Новый пароль</label>
                            <input type="email" class="form-control" id="password" >
                        </div>
                        <div class="form-group">
                            <label for="repeatPassword">Подтверждение пароля</label>
                            <input type="email" class="form-control" id="repeatPassword" >
                        </div>
                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-success"  data-dismiss="modal">Registration</button>
                    <!--todo привязать кнопку к форме -->
                </div>
            </div>
        </div>
    </div>
</div>


<!--&lt;!&ndash; Триггер кнопка модали&ndash;&gt;-->
<!--<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">-->
<!--Launch demo modal-->
<!--</button>-->

<!-- Модаль -->
<!--<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">-->
<!--<div class="modal-dialog" role="document">-->
<!--<div class="modal-content">-->
<!--<div class="modal-header">-->
<!--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>-->
<!--<h4 class="modal-title" id="myModalLabel">Modal title</h4>-->
<!--</div>-->
<!--<div class="modal-body">-->
<!--...-->
<!--</div>-->
<!--<div class="modal-footer">-->
<!--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>-->
<!--<button type="button" class="btn btn-primary">Save changes</button>-->
<!--</div>-->
<!--</div>-->
<!--</div>-->
<!--</div>-->

<%--<script src="../../static/js/jquery.js"></script>--%>
<%--<script src="../../static/js/bootstrap.js"></script>--%>
<%--<script src="../../static/js/application.js"></script>--%>




<%--<!--<script src="../../../static/js/application.js"></script>-->--%>
<%--</body>--%>
<%--</html>--%>