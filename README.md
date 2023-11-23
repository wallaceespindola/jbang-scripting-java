# jbang: scripting in java
Using Jbang scripting for running Java apps.

```bash
➜  jbang-scripting-java git:(main)✗ > sdk version

SDKMAN!
script: 5.18.2
native: 0.3.0

➜  git  > sdk install jbang

jbang 0.112.4 is already installed.

➜  git  > jbang
jbang is a tool for building and running .java/.jsh scripts and jar packages.
...
  
➜  git  > cd jbang-scripting-java 

➜  jbang-scripting-java git:(main)✗ > jbang init hello.java                             

[jbang] File initialized. You can now run it with 'jbang hello.java' or edit it using 'jbang edit --open=[editor] hello.java' where [editor] is your editor or IDE, e.g. 'code'. If your IDE supports JBang, you can edit the directory instead: 'jbang edit . 'hi.java. See https://jbang.dev/ide

➜  jbang-scripting-java git:(main)✗ > jbang hello.java                                  

[jbang] Building jar for hello.java...
Hello World

➜  jbang-scripting-java git:(main)✗ > ./hello.java                                      

Hello World

➜  jbang-scripting-java git:(main)✗ > jbang init hi.java                                

[jbang] File initialized. You can now run it with 'jbang hi.java' or edit it...

➜  jbang-scripting-java git:(main)✗ > jbang hi.java                                     
[jbang] Building jar for hi.java...
Hello World

➜  jbang-scripting-java git:(main)✗ > ./hi.java                                         

Hello World

➜  jbang-scripting-java git:(main)✗ > jbang init -t cli hellocli.java                   

[jbang] File initialized. You can now run it with 'jbang hellocli.java' or edit it...

➜  jbang-scripting-java git:(main)✗ > ./hellocli.java --help                            

[jbang] Resolving dependencies...
[jbang]    info.picocli:picocli:4.6.3
[jbang] Dependencies resolved
[jbang] Building jar for hellocli.java...
Usage: hellocli [-hV] <greeting>
hellocli made with jbang
      <greeting>   The greeting to print
  -h, --help       Show this help message and exit.
  -V, --version    Print version information and exit.

➜  jbang-scripting-java git:(main)✗ > ./hellocli.java Wallace!                          

Hello Wallace!

➜  jbang-scripting-java git:(main)✗ > jbang init -t cli helloclilonger.java             

[jbang] File initialized. You can now run it with 'jbang helloclilonger.java' or edit it...

➜  jbang-scripting-java git:(main)✗ > jbang edit --open=idea                               

[jbang] Assuming your editor have JBang support installed. See https://jbang.dev/ide
[jbang] If you prefer to open in a sandbox run with `jbang edit -b` instead.
[jbang] Starting 'idea'.If you want to make this the default, run 'jbang config set edit.open idea'

➜  jbang-scripting-java git:(main)✗ > ./helloclilonger.java JBang with a longer command 

[jbang] Building jar for helloclilonger.java...
Hello JBang with a longer command line

➜  jbang-scripting-java git:(main)✗ > ./helloclilonger.java Wallace, have a nice day!      

Hello Wallace, have a nice day!
```