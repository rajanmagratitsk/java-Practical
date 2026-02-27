

import javax.swing.*;
public class JMenubarExample extends JFrame{
    static JMenuBar mb;
    static JMenu file,edit,format,view,help,zoom;
    static JMenuItem neww,newWindow,open,save,saveAs,pageSetUp,print,exit,zoomIn,zoomout;
    static JFrame f;
    public static void main(String args[]){
        JMenubarExample m=new JMenubarExample();
        f=new JFrame("Menu demo");
        mb=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");
        format=new JMenu("Format");
        view=new JMenu("view");
        help=new JMenu("help");
        zoom=new JMenu("Zoom");
        neww=new JMenuItem("new");
        newWindow=new JMenuItem("New window");
        open=new JMenuItem("Open");
        save=new JMenuItem("save");
        saveAs=new JMenuItem("saveAs");
        pageSetUp=new JMenuItem("Page Setup");
        print= new JMenuItem("Print");
        exit=new JMenuItem("Exit");
       zoomIn=new JMenuItem("ZoomIn");
       zoomout=new JMenuItem("zoom out");
       file.add(neww);
       file.add(newWindow);
       file.add(open);
       file.add(save);
       file.add(saveAs);
       file.add(pageSetUp);
       file.add(print);
       file.add(exit);
       file.add(zoom);
       zoom.add(zoomIn);
       zoom.add(zoomout);
       
       mb.add(file);
       mb.add(edit);
       mb.add(format);
       mb.add(view);
       mb.add(help);
       f.setJMenuBar(mb);
       f.setSize(400,500);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
       
       
       
       
        
    
}
}