package Question4;
import Question4.FileType.*;

public class FileDriver {
    public static void main(String[] args) {

        // Start of structure
        Folder fileStructure = new Folder("php_demo1");

        // RECREATE STRUCTURE FROM IMAGE
        // Add folders to php_demo1
        fileStructure.addFolder("Source Files");
        fileStructure.addFolder("Include Path");
        fileStructure.addFolder("RemoteFiles");

        // Add folders to php_demo1/Source Files
        fileStructure.folders.getFirst().addFolder(".phalcon");
        fileStructure.folders.getFirst().addFolder("app");
        fileStructure.folders.getFirst().addFolder("cache");
        fileStructure.folders.getFirst().addFolder("public");

        // Add folders to php_demo1/Source Files/app
        fileStructure.folders.getFirst().folders.get(1).addFolder("config");
        fileStructure.folders.getFirst().folders.get(1).addFolder("controllers");
        fileStructure.folders.getFirst().folders.get(1).addFolder("library");
        fileStructure.folders.getFirst().folders.get(1).addFolder("migrations");
        fileStructure.folders.getFirst().folders.get(1).addFolder("models");
        fileStructure.folders.getFirst().folders.get(1).addFolder("views");

        // Add files to php_demo1/Source Files/public
        fileStructure.folders.getFirst().folders.get(3).addFile(".htaccess");
        fileStructure.folders.getFirst().folders.get(3).addFile(".htrouter.php");
        fileStructure.folders.getFirst().folders.get(3).addFile(".index.html");

        fileStructure.printFolder();

        // Remove php_demo1/Source Files/app
        fileStructure.folders.getFirst().folders.remove(1);
        fileStructure.printFolder();

        // Remove php_demo1/Source Files/public
        fileStructure.folders.getFirst().folders.removeLast();
        fileStructure.printFolder();

    }
}
