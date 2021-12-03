package com.example.notetaker

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initialiseCourses()
        courses.toSortedMap()
    }
    private  fun initialiseCourses() {
        var course = CourseInfo("android_intents", "Android programing with intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programing and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }
}