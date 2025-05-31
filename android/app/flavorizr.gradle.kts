import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("flavor-type")

    productFlavors {
        create("dev") {
            dimension = "flavor-type"
            applicationId = "highqapps.flavors.course.dev"
            resValue(type = "string", name = "app_name", value = "Flavors Course Dev")
        }
        create("stg") {
            dimension = "flavor-type"
            applicationId = "highqapps.flavors.course.stg"
            resValue(type = "string", name = "app_name", value = "Flavors Course Stg")
        }
        create("prod") {
            dimension = "flavor-type"
            applicationId = "highqapps.flavors.course"
            resValue(type = "string", name = "app_name", value = "Flavors Course")
        }
    }
}