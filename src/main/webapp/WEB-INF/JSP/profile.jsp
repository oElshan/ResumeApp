
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="profile" tagdir="/WEB-INF/tags/profile" %>
<div class="container profile">
        <div class="row">
            <div class="col-lg-4 col-sm-6 col-md-4">
                    <profile:profile-avatar/>
                <div class="hidden-xs">
                    <profile:profile-languages/>
                    <profile:profile-hobby/>
                </div>

            </div>
            <div class="col-lg-8 col-sm-6 col-md-8 ">
                <profile:profile-objective/>
                <profile:profile-technicalSkills/>
                <profile:profile-practic/>
                <profile:profile-certificates/>
                <profile:profile-courses/>
                <profile:profile-education/>
                <div class="visible-xs">
                    <profile:profile-languages/>
                    <profile:profile-hobby/>
                </div>
            </div>

        </div>
</div>