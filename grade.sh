 rm -rf student-submission
git clone $1 student-submission
cd student-submission
if [ -e "ListExamples.java" ]
then
    echo "The file ListExamples.java exists [+2 point]"
    ((score+=2))
else
    echo "The file ListExamples.java does not exist [+0 point]"
    echo "Final Grade: [0/10]"
    exit
fi
cp ../TestListExamples.java ./
javac -cp .:../lib/hamcrest-core-1.3.jar:../lib/junit-4.13.2.jar *.java 2> comp
if [[ $? -eq 0 ]]
then
    echo "compiled successfully [+3 point]"
    ((score+=3))
