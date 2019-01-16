package ex1;

public class Eu {

	public static void main(String[] args) {
		System.out.println("eu merg la mare");
		// daca fac aici o modificare, prin bifarea Smc poll se va trigeeruir singur jenkins si va face test goal
		// vezi ca aici este workspace C:\Program Files (x86)\Jenkins\workspace\mavenIgnore
		// goal test
		
		// daca nu vrei sa impingi tot pe github 
		// le pui in gitignore pe care il creezi tu
		// fisierul asta nu se vede aici
		// pe github este maven ignore
		// cauta-l in fisiere pe .gitignore
		/*
		 * git init
		 * 
		 * git add .
		 * 
		 * git commit -m "First commit"
		 * 
		 * git remote add origin https://github.com/mtrusca24/gitandgithub2.git
# Sets the new remote
git remote -v
# Verifies the new remote URL

git push origin master
		 * 
		 * # Eclipse
.classpath
.project
.settings/

# Intellij
.idea/
*.iml
*.iws

# Mac
.DS_Store

# Maven
log/
target
		 */

	}

}
