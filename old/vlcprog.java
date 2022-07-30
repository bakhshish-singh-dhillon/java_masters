class vlcprog
{
public static void main(String args[])
{
try
{
ProcessBuilder pb=new ProcessBuilder("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe","E:\\Songs\\Jeff Bridges\\Various Artists - Crazy Heart (Soundtrack)  - 320Kbps VBR MP3\\18 Townes Van Zandt - If I Needed You.mp3");
pb.start();
}
catch(Exception e)
{
System.out.println(e);
}
}
}