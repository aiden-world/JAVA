
public class GBK_UTF8 {
public static void main(String[] args) throws Exception {
    //GBK�����ʽԴ��·��
    String srcDirPath = "C:\\Users\\think\\Desktop\\�й��\\JavaSE20190218\\01_�й��_������_JavaSE\\code\\day12";
    //תΪUTF-8�����ʽԴ��·��
    String utf8DirPath = "C:\\Users\\think\\Desktop\\�й��\\JavaSE20190218\\01_�й��_������_JavaSE\\code\\day12\\1";
         
    //��ȡ����java�ļ�
    Collection<File> javaGbkFileCol =  FileUtils.listFiles(new File(srcDirPath), new String[]{"java"}, true);
    for (File javaGbkFile : javaGbkFileCol) {
    //UTF8��ʽ�ļ�·��
    String utf8FilePath = utf8DirPath+javaGbkFile.getAbsolutePath().substring(srcDirPath.length());
    //ʹ��GBK��ȡ���ݣ�Ȼ����UTF-8д������
    FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils.readLines(javaGbkFile, "GBK"));     
    }
}
}
