package day_03;

public class day03_ClassNotes {

    /*

    git

what is command :
cd -> change diractory
cd ..
ls




InTelliJ is an IDE

2 repositories :

1. Local (git) repository -> .GIT FOLDER

      you need to perform commands on Terminal

      git init -> creating local repositoy

2. Remote repository (GitHub)
     " + " click on github

git add
git commit
git push
git pull


git commit -m"add filename.fileextention BOA56"

login
java class -> Login.java

html -> screenshot.html
gitPractice.iml




---------------------
1. Crated a class : addCommand
2. I want to add ONLY this class to staging area

       git add src/day_1/addCommand.java

--------------------
Task:
1. Open gitPractice2 project
2. Create a class under day_1: HappyBirthday

3. add it to staging area
       git add .

4. Commit it local repo
       git commit -m"add HappyBirthday.java"

5. push it to remote repo github
         git push

-------------------------

Task2 :

1. go to Github -- gitPractice2
2. open HappyBirthday class and edit it
3. click "Commit changes"
      ( update HappyBirthday.Java )

How can we update the new version of my code to IntellIj?
         frist way :
                   git pull
         Second way:
                   git fetch
                   git merge
---------------------

when you do git push, you might see this error meesage :


! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to ‘https://github.com/
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: ‘git pull ...’) before pushing again.
hint: See the ‘Note about fast-forwards’ in ‘git push --help’ for details.


how to fix :  git pull
              git push

-----------------------------


how to clone someone's project

B18Java

1. goto that person's github
2. find the spesific repository / project name
3. copy the URL
4. pate it in IntellIj

becasue this project is someone else's , I can pull eveyday to update
but I cannot push becasue I do have authority.


-----------------------------
IDE - Integrated development environemnt






     */
}
