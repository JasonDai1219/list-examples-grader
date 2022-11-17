# Create your grading script here


rm -rf student-submission
git clone $1 student-submission

cd student-submission
if [ -e "ListExamples.java" ]
then 
    echo "true"
else 
    echo "The submission has wrong name"
    exit
fi
cp ../TestListExamples.java ./

javac ListExamples.java
javac TestListExamples.java
if [[ $? == 0 ]]
then 
    javac -cp .:../lib/hamcrest-core-1.3.jar:../lib/junit-4.13.2.jar *.java
    java -cp .:../lib/hamcrest-core-1.3.jar:../lib/junit-4.13.2.jar org.junit.runner.JUnitCore TestListExamples
else
    echo "Files are not compiling"
fi
