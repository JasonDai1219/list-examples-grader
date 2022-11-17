# Create your grading script here

set -e

rm -rf student-submission
git clone $1 student-submission

cd student-submission
if [-e ListExamples.java]
then 
    echo "The submission has wrong name"
fi
cp TestListExamples student-submission

javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java 2> compile-err.txt

java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore TestListExamples

