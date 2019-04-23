
public class GBK_UTF8 {
public static void main(String[] args) throws Exception {
    //GBK编码格式源码路径
    String srcDirPath = "C:\\Users\\think\\Desktop\\尚硅谷\\JavaSE20190218\\01_尚硅谷_大数据_JavaSE\\code\\day12";
    //转为UTF-8编码格式源码路径
    String utf8DirPath = "C:\\Users\\think\\Desktop\\尚硅谷\\JavaSE20190218\\01_尚硅谷_大数据_JavaSE\\code\\day12\\1";
         
    //获取所有java文件
    Collection<File> javaGbkFileCol =  FileUtils.listFiles(new File(srcDirPath), new String[]{"java"}, true);
    for (File javaGbkFile : javaGbkFileCol) {
    //UTF8格式文件路径
    String utf8FilePath = utf8DirPath+javaGbkFile.getAbsolutePath().substring(srcDirPath.length());
    //使用GBK读取数据，然后用UTF-8写入数据
    FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils.readLines(javaGbkFile, "GBK"));     
    }
}
}
