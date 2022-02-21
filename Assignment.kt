

package assignment
import java.io.PrintWriter
import java.io.File
import java.io.FileWriter

// INSTRUCTIONS:
// 1. Read a list of student responses from text file
// 2. Filter students who are not covid positive
// 3. Sort them according to their branches, within each branch sort by names
// 4. Break branches into groups of 3
// 5. Save the student batches in a text file
//
data class Response(
    val name: String,
    val rollNumber: Int,
    val branch: String,
    val covidPositive: Boolean
)

fun main() {
    val name: String
    val rollNumber: Int
    val branch: String
    val covidPositive: Boolean = false
    val responses= listOf(
        Response("Oliver", 2138129, "ECE", true),
        Response("Sophia", 1263612, "CSE", false),
        Response("James", 8429918, "CHE", true),
        Response("Emily", 4736471, "CIV", false),
        Response("Chloe", 4283661, "CHE", false),
        Response("Jacob", 3246617, "CSE", false),
        Response("Daniel", 8783261, "MIN", false),
        Response("Hazel", 2361718, "ECE", false),
        Response("Lily", 3462691, "CSE", true),
        Response("Jack", 5672351, "CHE", false),
        Response("Nora", 4123894, "PHE", false),
        Response("Owen", 4898291, "PHE", false),
        Response("Harry", 1278934, "ECE", false),
        Response("Eliana", 9090341, "MAT", false),
        Response("Peter", 3234291, "CHE", true),
        Response("Charles", 3491897, "CSE", true),
        Response("Ryan", 9071271, "PHE", false),
        Response("Daisy", 7364891, "MIN", false),
        Response("Angel", 1317382, "EEE", false),
        Response("Jasper", 2366236, "EEE", false),
        Response("Sarah", 1334921, "MAT", false),
        Response("Clara", 4328992, "MAT", false),
        Response("Kevin", 4271786, "MEC", false)
    )

    val processedData = responses.filter { !it .covidPositive }
    val processedData_by_name = processedData.sortedWith(compareBy({ it.branch }, { it.name }))

    val count=processedData_by_name.count()
    val data=processedData_by_name.chunked(count/3)
    for(it in processedData_by_name.chunked(count/3)){
        for(i in it){
            println(i)

        }
            println( )

        }
    File("C:\\Users\\user\\IdeaProjects\\untitled\\src\\main\\kotlin\\Data.txt").writeText(data.toString())

}

