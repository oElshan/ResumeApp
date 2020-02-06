
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="edit" tagdir="/WEB-INF/tags/edit" %>

<div class="container">
    <div class="row">

        <ul class="nav nav-tabs" id="editTab">
            <li class="active"><a href="#main">Основное</a></li>
            <li><a href="#contacts">Контакты</a></li>
            <li><a href="#technicalSkills">Технические навыки</a></li>
            <li><a href="#practical">Практический опыт</a></li>
            <li><a href="#certificates">Сертификаты</a></li>
            <li><a href="#courses">Курсы</a></li>
            <li><a href="#education">Образование</a></li>
            <li><a href="#languages">Языки</a></li>
            <li><a href="#hobby">Хобби</a></li>
            <li><a href="#other">Дополнительно</a></li>

        </ul>

        <div class="tab-content">
            <edit:edit-main/>
            <div class="tab-pane" id="contacts">jome</div>
            <div class="tab-pane" id="technicalSkills">technicalSkills</div>
            <div class="tab-pane" id="practical">message</div>
            <div class="tab-pane" id="certificates">settings</div>
            <div class="tab-pane" id="courses">settings</div>
            <div class="tab-pane" id="education">settings</div>
            <div class="tab-pane" id="languages">settings</div>
            <div class="tab-pane" id="hobby">settings</div>
            <div class="tab-pane" id="other">settings</div>
        </div>

    </div>

</div>
