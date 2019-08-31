
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="resume" tagdir="/WEB-INF/tags/profile" %>
<div class="container profile">
        <div class="row">
            <div class="col-lg-4 col-sm-6 col-md-4">
                    <resume:profile-avatar/>
                <div class="hidden-xs">
                    <resume:profile-languages/>
                    <resume:profile-hobbi/>
                </div>

            </div>
            <div class="col-lg-8 col-sm-6 col-md-8 ">
                <resume:profile-objective/>
                <resume:profile-technicalSkills/>
                <resume:profile-practic/>
                <resume:profile-certificates/>
                <resume:profile-courses/>
                <resume:profile-education/>
                <div class="visible-xs">
                    <resume:profile-languages/>
                    <resume:profile-hobbi/>
                </div>
            </div>

        </div>
</div>