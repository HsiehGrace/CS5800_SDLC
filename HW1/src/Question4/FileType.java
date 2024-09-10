package Question4;

import java.util.ArrayList;

public class FileType {

    public static class Folder{
        private String folderName;
        ArrayList<Folder> folders;
        ArrayList<File> files;

        // Constructors
        public Folder(){
            folderName = "";
            folders = new ArrayList<>();
            files = new ArrayList<>();
        }

        public Folder(String folderName){
            this.folderName = folderName;
            folders = new ArrayList<>();
            files = new ArrayList<>();
        }

        // Getters
        public String getFolderName(){
            return folderName;
        }

        // Setters
        public void setFolderName(String folderName){
            this.folderName = folderName;
        }


        // Adding Folders
        public void addFolder(Folder folder){
            folders.add(folder);
        }
        public void addFolder(String folderName){
            folders.add(new Folder(folderName));
        }

        // Adding Files
        public void addFile(File file){
            files.add(file);
        }
        public void addFile(String fileName){
            files.add(new File(fileName));
        }


        // For first folder
        public void printFolder()
        {
            this.printFolder(0);
            System.out.println();
        }

        public void printFolder(int tabs) {
            // Print the name of this folder
            for (int i = 0; i < tabs; i++) {
                System.out.print("\t");
            }

            System.out.println(folderName);

            // Print all nested folders
            for (Folder folder : folders) {
                folder.printFolder(tabs + 1);
            }

            // Print files in folder
            for (File file : files) {
                file.printFile(tabs + 1);
            }
        }

    }

    public static class File{
        private String fileName;

        // Constructors
        public File(){
            fileName = "";
        }

        public File(String fileName){
            this.fileName = fileName;
        }

        // Getter
        public String getFileName(){
            return fileName;
        }

        // Setter
        public void setFileName(String fileName){
            this.fileName = fileName;
        }

        public void printFile() {
            System.out.println(fileName);
        }

        public void printFile(int tabs) {
            for (int i = 0; i < tabs; i++) {
                System.out.print("\t");
            }
            System.out.println(fileName);
        }
    }
}
