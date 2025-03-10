package com.example.yofu

import android.annotation.SuppressLint
import android.graphics.Bitmap
import com.google.firebase.Timestamp
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


@SuppressLint("StaticFieldLeak")
val db = Firebase.firestore

val emptyCompanyRef = db.collection("company").document("CID")
val emptyUser = db.collection("user").document("UID")
val emptyVacancy = db.collection("vacancy").document("VID")

data class Vacancy(
    var vid: String = "", //Vacancy Id
    var manager: DocumentReference = emptyCompanyRef,
    var title: String = "",
    var minSalary: Double = 0.0,
    var maxSalary: Double = 0.0,
    var location: String = "",
    var position: String = "",
    var jobType: String = "",
    var updatedDate: Timestamp = Timestamp(0,0),
    var expiredDate: Timestamp = Timestamp(0,0),
    var isActive: Boolean = false,
)

data class JobApplication(
    var aid: String = "",
    var vid: DocumentReference = emptyVacancy,
    var uid: DocumentReference = emptyUser,
    var cvRef: DocumentReference = emptyUser,
    var status: String = ""
)

data class  User(
    var uid: String = "",
    var cid: DocumentReference = emptyCompanyRef,
    var fullName: String = "",
    var birthDate: Timestamp = Timestamp(0,0),
    var userType: String = "",
    var avt: Bitmap? = null,
    var avtRef: DocumentReference = emptyUser,
    var gender: String = "",
    var phone: String = ""
)

data class Company(
    var cid: String = "",
    var name: String = "",
    var manager: DocumentReference = emptyUser,
    var description: String = "",
    var location: String = "",
    var website: String = "",
    var phone: String = "",
    var email: String = ""
)

data class UserLogin(
    var email: String = "",
    var password: String = ""
)

//fun map(data: Vacancy): HashMap<String, Any> {
//    return hashMapOf(
//        "manager" to data.manager,
//        "title" to data.title,
//        "minSalary" to data.minSalary,
//        "maxSalary" to data.maxSalary,
//        "location" to data.location,
//        "position" to data.position,
//        "jopType" to data.jobType,
//        "updatedDate" to data.updatedDate,
//        "expiredDate" to data.expiredDate,
//        "isActive" to data.isActive
//    )
//}
//
//fun map(data: JobApplication): HashMap<String, Any>
//{
//    return hashMapOf(
//        "vid" to data.vid,
//        "uid" to data.vid,
//        "cvRef" to data.cvRef,
//        "status" to data.status
//    )
//}
//
//fun map(data: User): HashMap<String, Any>
//{
//    return hashMapOf(
//        "cid" to data.cid,
//        "fullName" to data.fullName,
//        "birthDate" to data.birthDate,
//        "userType" to data.userType,
//        "avtRef" to data.avtRef,
//        "gender" to data.gender,
//        "phone" to data.phone
//    )
//}
//
//fun map(data: Company): HashMap<String, Any>
//{
//    return hashMapOf(
//        "name" to data.name,
//        "manager" to data.manager,
//        "description" to data.description,
//        "location" to data.location,
//        "website" to data.website,
//        "phone" to data.phone,
//        "email" to data.email
//    )
//}