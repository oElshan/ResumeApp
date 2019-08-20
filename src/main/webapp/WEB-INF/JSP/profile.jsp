
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Resume</title>
        <link href="../../static/css/bootstrap.css" rel="stylesheet">
        <link href="../../static/css/bootstrap-theme.css" rel="stylesheet">
        <link href="../../static/css/font-awesome.css" rel="stylesheet">
        <link href="../../static/css/app.css" rel="stylesheet">
    </head>
    <body>
    <div class="container">

        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand и toggle сгруппированы для лучшего отображения на мобильных дисплеях -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Brand</a>
                </div>

                <!-- Соберите навигационные ссылки, формы, и другой контент для переключения -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
                        <li><a href="#">Link</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Separated link</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Link</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>


        <main>
            <div class="row">
                <div class="col-lg-4 col-sm-6 col-md-4">
                    <div class="panel panel-default" >
                        <div class="panel-body">
                            <div class="row">

                                    <a href="#" class="thumbnail">
                                        <img src="https://via.placeholder.com/400" alt="...">
                                    </a>

                            </div>
                        </div>
                    </div>
                </div>

                    <div class="panel panel-primary"  >
                        <div class="panel-heading">Objective</div>
                        <div class="panel-body">
                            Panel content
                        </div>
                    </div>
                    <div class="panel panel-primary"  >
                        <div class="panel-heading">Objective</div>
                        <div class="panel-body">
                            Panel content
                        </div>
                    </div>
                    <div class="panel panel-primary"  >
                        <div class="panel-heading">Objective</div>
                        <div class="panel-body">
                            Panel content
                        </div>
                    </div>
                 </div>

                <div class="col-lg-8 col-sm-6 col-md-8">
                    <div class="panel panel-primary"  >
                        <div class="panel-heading">Objective</div>
                        <div class="panel-body">
                            Panel content
                        </div>
                    </div>

                    <div class="panel panel-primary"  >
                        <div class="panel-heading">Objective</div>
                        <div class="panel-body">
                            Panel content
                        </div>
                    </div>

                    <div class="panel panel-primary"  >
                        <div class="panel-heading">Objective</div>
                        <div class="panel-body">
                            Panel content
                        </div>
                    </div>

                    <div class="panel panel-primary"  >
                        <div class="panel-heading">Objective</div>
                        <div class="panel-body">
                            Panel content
                        </div>
                    </div>

                    <div class="panel panel-primary"  >
                        <div class="panel-heading">Objective</div>
                        <div class="panel-body">
                            Panel content
                        </div>
                    </div>

                </div>





        </main>


        <footer>
            This is footer
        </footer>
    </div>

        <script src="../../static/js/jquery.js"></script>
        <script src="../../static/js/bootstrap.js"></script>
        <script src="../../static/js/app.js"></script>
    </body>
</html>
