import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
class picpuzzle2 extends JFrame implements ActionListener{
  
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,sample,sampelGambar,starB;
  
  Icon star;
  int score = 0; 
  JLabel l4; 
  //////////////////////////////////////////////////////////
  Icon ic0=new ImageIcon("pic/BEBEK/15.jpg");
  Icon ic17=new ImageIcon("pic/CAPY/15.jpg");
  Icon ic34=new ImageIcon("pic/KORENG/15.jpg");
  Icon ic51=new ImageIcon("pic/DOGGE/15.jpg");
  //////////////////////////////////////////////////////////
  Icon samicon1=new ImageIcon("pic/BEBEK/BEBEK.jpg");
  Icon samicon2=new ImageIcon("pic/CAPY/CAPY.jpg");
  Icon samicon3=new ImageIcon("pic/KORENG/KORENG.jpg");
  Icon samicon4=new ImageIcon("pic/DOGGE/DOGGE.jpg");
  //////////////////////////////////////////////////////////
  //Level DUCK
  Icon ic1=new ImageIcon("pic/BEBEK/4.jpg");
  Icon ic2=new ImageIcon("pic/BEBEK/0.jpg");
  Icon ic3=new ImageIcon("pic/BEBEK/1.jpg");
  Icon ic4=new ImageIcon("pic/BEBEK/6.jpg");
  Icon ic5=new ImageIcon("pic/BEBEK/8.jpg");
  Icon ic6=new ImageIcon("pic/BEBEK/14.jpg");
  Icon ic7=new ImageIcon("pic/BEBEK/7.jpg");
  Icon ic8=new ImageIcon("pic/BEBEK/3.jpg");
  Icon ic9=new ImageIcon("pic/BEBEK/15.jpg");
  Icon ic10=new ImageIcon("pic/BEBEK/9.jpg");
  Icon ic11=new ImageIcon("pic/BEBEK/5.jpg");
  Icon ic12=new ImageIcon("pic/BEBEK/2.jpg");
  Icon ic13=new ImageIcon("pic/BEBEK/10.jpg");
  Icon ic14=new ImageIcon("pic/BEBEK/12.jpg");
  Icon ic15=new ImageIcon("pic/BEBEK/13.jpg");
  Icon ic16=new ImageIcon("pic/BEBEK/11.jpg");

  //////////////////////////////////////////////////////////
  //Level CAPYBARA
  Icon ic18=new ImageIcon("pic/CAPY/4.jpg");
  Icon ic19=new ImageIcon("pic/CAPY/0.jpg");
  Icon ic20=new ImageIcon("pic/CAPY/1.jpg");
  Icon ic21=new ImageIcon("pic/CAPY/6.jpg");
  Icon ic22=new ImageIcon("pic/CAPY/8.jpg");
  Icon ic23=new ImageIcon("pic/CAPY/14.jpg");
  Icon ic24=new ImageIcon("pic/CAPY/7.jpg");
  Icon ic25=new ImageIcon("pic/CAPY/3.jpg");
  Icon ic26=new ImageIcon("pic/CAPY/15.jpg");
  Icon ic27=new ImageIcon("pic/CAPY/9.jpg");
  Icon ic28=new ImageIcon("pic/CAPY/5.jpg");
  Icon ic29=new ImageIcon("pic/CAPY/2.jpg");
  Icon ic30=new ImageIcon("pic/CAPY/10.jpg");
  Icon ic31=new ImageIcon("pic/CAPY/12.jpg");
  Icon ic32=new ImageIcon("pic/CAPY/13.jpg");
  Icon ic33=new ImageIcon("pic/CAPY/11.jpg");
  /////////////////////////////////////////////////////////
  //Level KORENG
  Icon ic35=new ImageIcon("pic/KORENG/4.jpg");
  Icon ic36=new ImageIcon("pic/KORENG/0.jpg");
  Icon ic37=new ImageIcon("pic/KORENG/1.jpg");
  Icon ic38=new ImageIcon("pic/KORENG/6.jpg");
  Icon ic39=new ImageIcon("pic/KORENG/8.jpg");
  Icon ic40=new ImageIcon("pic/KORENG/14.jpg");
  Icon ic41=new ImageIcon("pic/KORENG/7.jpg");
  Icon ic42=new ImageIcon("pic/KORENG/3.jpg");
  Icon ic43=new ImageIcon("pic/KORENG/15.jpg");
  Icon ic44=new ImageIcon("pic/KORENG/9.jpg");
  Icon ic45=new ImageIcon("pic/KORENG/5.jpg");
  Icon ic46=new ImageIcon("pic/KORENG/2.jpg");
  Icon ic47=new ImageIcon("pic/KORENG/10.jpg");
  Icon ic48=new ImageIcon("pic/KORENG/12.jpg");
  Icon ic49=new ImageIcon("pic/KORENG/13.jpg");
  Icon ic50=new ImageIcon("pic/KORENG/11.jpg");
  ////////////////////////////////////////////////////////////
  //level DOGGE
  Icon ic52=new ImageIcon("pic/DOGGE/4.jpg");
  Icon ic53=new ImageIcon("pic/DOGGE/0.jpg");
  Icon ic54=new ImageIcon("pic/DOGGE/1.jpg");
  Icon ic55=new ImageIcon("pic/DOGGE/6.jpg");
  Icon ic56=new ImageIcon("pic/DOGGE/8.jpg");
  Icon ic57=new ImageIcon("pic/DOGGE/14.jpg");
  Icon ic58=new ImageIcon("pic/DOGGE/7.jpg");
  Icon ic59=new ImageIcon("pic/DOGGE/3.jpg");
  Icon ic60=new ImageIcon("pic/DOGGE/15.jpg");
  Icon ic61=new ImageIcon("pic/DOGGE/9.jpg");
  Icon ic62=new ImageIcon("pic/DOGGE/5.jpg");
  Icon ic63=new ImageIcon("pic/DOGGE/2.jpg");
  Icon ic64=new ImageIcon("pic/DOGGE/10.jpg");
  Icon ic65=new ImageIcon("pic/DOGGE/12.jpg");
  Icon ic66=new ImageIcon("pic/DOGGE/13.jpg");
  Icon ic67=new ImageIcon("pic/DOGGE/11.jpg");

  ////////////////////timer
   int[] secondsHolder = { 0 }; 
  //////////////////////timer
picpuzzle2(){

super("PUZZLE GAME BY TUGAS AHIR PBO 135");

LineBorder border = new LineBorder(Color.black, 3); // Warna

b1=new JButton(ic1);
b1.setBounds(10,80,150,150);
b1.setBorder(border);

b2=new JButton(ic2);
b2.setBounds(160,80,150,150);
b2.setBorder(border);

b3=new JButton(ic3);
b3.setBounds(310,80,150,150);
b3.setBorder(border);

b4=new JButton(ic4);
b4.setBounds(460,80,150,150);
b4.setBorder(border);
//////////////////////////////////////////////
b5=new JButton(ic5);
b5.setBounds(10,230,150,150);
b5.setBorder(border);

b6=new JButton(ic6);
b6.setBounds(160,230,150,150);
b6.setBorder(border);

b7=new JButton(ic7);
b7.setBounds(310,230,150,150);
b7.setBorder(border);

b8=new JButton(ic8);
b8.setBounds(460,230,150,150);
b8.setBorder(border);
//////////////////////////////////////////////
b9=new JButton(ic9);
b9.setBounds(10,380,150,150);
b9.setBorder(border);

b10 = new JButton(ic10);
b10.setBounds(160, 380, 150, 150);
b10.setBorder(border);

b11 = new JButton(ic11);
b11.setBounds(310, 380, 150, 150);
b11.setBorder(border);

b12 = new JButton(ic12);
b12.setBounds(460, 380, 150, 150);
b12.setBorder(border);
/////////////////////////////////////////////////
b13 = new JButton(ic13);
b13.setBounds(10, 530, 150, 150);
b13.setBorder(border);

b14 = new JButton(ic14);
b14.setBounds(160, 530, 150, 150);
b14.setBorder(border);

b15 = new JButton(ic15);
b15.setBounds(310, 530, 150, 150);
b15.setBorder(border);

b16 = new JButton(ic16);
b16.setBounds(460, 530, 150, 150);
b16.setBorder(border);

/////////////////////////////////////////////////////////////CONTOH GAMBAR
sample=new JButton(samicon1);
sample.setBounds(620,100,500,500);
/////////////////////////////////////////////////////////////

JLabel l1=new JLabel("Sample:");
l1.setBounds(620,70,70,20);
l1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

JLabel l2=new JLabel("Geser gambar yang terdapat bintang untuk menyelesaikan puzzel");
l2.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
l2.setBounds(5,15,500,20);

JLabel l3=new JLabel("klik gambar di atas untuk lanjut");
l3.setBorder(BorderFactory.createLineBorder(Color.red, 2));
l3.setBounds(660,600,200,20);
l3.setForeground(Color.red);

l4 = new JLabel("langkah: 0"); 
l4.setBounds(450, 35, 70, 20);




//////////////////////////////////////////////////////////GAMBAR BERGERAK
starB=new JButton(ic16);
// starB.setBounds(330,5,80,80);
star=b9.getIcon();
///////////////////////////////////////////////////////////
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);
add(b9);add(b10);add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);
add(sample);add(l1);add(l2);add(starB);add(l3);add(l4);
b1.addActionListener(this); 
b2.addActionListener(this); 
b3.addActionListener(this); 
b4.addActionListener(this); 
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this); 
b8.addActionListener(this); 
b9.addActionListener(this);
b10.addActionListener(this); 
b11.addActionListener(this);
b12.addActionListener(this); 
b13.addActionListener(this); 
b14.addActionListener(this); 
b15.addActionListener(this); 
b16.addActionListener(this); 

sample.addActionListener(this);
setLayout(null);
setSize(600,500);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//////////////////////////////////////////////////
JLabel timerLabel = new JLabel("Time: 0 seconds");
        timerLabel.setBounds(530, 31, 100, 30);
        add(timerLabel);

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secondsHolder[0]++; 
                timerLabel.setText("time: " + secondsHolder[0]);
            }
        });
        timer.start();
////////////////TIMER PROSES/////////////////////
}

public void actionPerformed(ActionEvent e){
  if(e.getSource()==b1){
      Icon s1=b1.getIcon();
        if(b2.getIcon()==star){
          b2.setIcon(s1);
          b1.setIcon(star);
        } 
        else if(b5.getIcon()==star){
          b5.setIcon(s1);
          b1.setIcon(star);
        }
      score++;
      l4.setText("Langkah : " + score);
      
    }

  if(e.getSource()==b2){
      Icon s1=b2.getIcon();
        if(b1.getIcon()==star){
          b1.setIcon(s1);
          b2.setIcon(star);
        } 
        else if(b6.getIcon()==star){
          b6.setIcon(s1);
          b2.setIcon(star);
        }
        else if(b3.getIcon()==star){
          b3.setIcon(s1);
          b2.setIcon(star);
        }
      score++;
      l4.setText("Langkah : " + score);
    }
  
  if(e.getSource()==b3){
      Icon s1=b3.getIcon();
        if(b2.getIcon()==star){
          b2.setIcon(s1);
          b3.setIcon(star);
        } 
        else if(b7.getIcon()==star){
          b7.setIcon(s1);
          b3.setIcon(star);
        }
        else if(b4.getIcon()==star){
          b4.setIcon(s1);
          b3.setIcon(star);
        }
        
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
    }//end of if

  if(e.getSource()==b4){
      Icon s1=b4.getIcon();
        if(b3.getIcon()==star){
          b3.setIcon(s1);
          b4.setIcon(star);
        } 
        else if(b8.getIcon()==star){
          b8.setIcon(s1);
          b4.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
    }//end of if

  if(e.getSource()==b5){
      Icon s1=b5.getIcon();
        if(b1.getIcon()==star){
          b1.setIcon(s1);
          b5.setIcon(star);
        }
        else if(b6.getIcon()==star){
          b6.setIcon(s1);
          b5.setIcon(star);
        }
        else if(b9.getIcon()==star){
          b9.setIcon(s1);
          b5.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
    }//end of if

  if(e.getSource()==b6){
      Icon s1=b6.getIcon();
        if(b2.getIcon()==star){
          b2.setIcon(s1);
          b6.setIcon(star);
        } 
        else if(b5.getIcon()==star){
          b5.setIcon(s1);
          b6.setIcon(star);
        }
        else if(b10.getIcon()==star){
          b10.setIcon(s1);
          b6.setIcon(star);
        }
        else if(b7.getIcon()==star){
          b7.setIcon(s1);
          b6.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
  }//end of if

  if(e.getSource()==b7){
      Icon s1=b7.getIcon();
        if(b3.getIcon()==star){
          b3.setIcon(s1);
          b7.setIcon(star);
        } 
        else if(b6.getIcon()==star){
          b6.setIcon(s1);
          b7.setIcon(star);
        }
        else if(b11.getIcon()==star){
          b11.setIcon(s1);
          b7.setIcon(star);
        }
        else if(b8.getIcon()==star){
          b8.setIcon(s1);
          b7.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
  }//end of if

   if(e.getSource()==b8){
    Icon s1=b8.getIcon();
       if(b4.getIcon()==star){
         b4.setIcon(s1);
        b8.setIcon(star);
       } 
       else if(b7.getIcon()==star){
        b7.setIcon(s1);
        b8.setIcon(star);
      }
      else if(b12.getIcon()==star){
        b12.setIcon(s1);
        b8.setIcon(star);
      }
    score++; // Increment score for every move
    l4.setText("Langkah : " + score); // Update score label

  }//end of if

  if(e.getSource()==b9){
      Icon s1=b9.getIcon();
        if(b5.getIcon()==star){
          b5.setIcon(s1);
          b9.setIcon(star);
        } 
        else if(b10.getIcon()==star){
          b10.setIcon(s1);
          b9.setIcon(star);
        }
        else if(b13.getIcon()==star){
          b13.setIcon(s1);
          b9.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
    }//end of if

    if(e.getSource()==b10){
      Icon s1=b10.getIcon();
        if(b6.getIcon()==star){
          b6.setIcon(s1);
          b10.setIcon(star);
        } 
        else if(b9.getIcon()==star){
          b9.setIcon(s1);
          b10.setIcon(star);
        }
        else if(b14.getIcon()==star){
          b14.setIcon(s1);
          b10.setIcon(star);
        }
        else if(b11.getIcon()==star){
          b11.setIcon(s1);
          b10.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
    }//end of if

    if(e.getSource()==b11){
      Icon s1=b11.getIcon();
        if(b7.getIcon()==star){
          b7.setIcon(s1);
          b11.setIcon(star);
        } 
        else if(b10.getIcon()==star){
          b10.setIcon(s1);
          b11.setIcon(star);
        }
        else if(b15.getIcon()==star){
          b15.setIcon(s1);
          b11.setIcon(star);
        }
        else if(b12.getIcon()==star){
          b12.setIcon(s1);
          b11.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
    }//end of if

    if(e.getSource()==b12){
      Icon s1=b12.getIcon();
        if(b8.getIcon()==star){
          b8.setIcon(s1);
          b12.setIcon(star);
        } 
        else if(b11.getIcon()==star){
          b11.setIcon(s1);
          b12.setIcon(star);
        }
        else if(b16.getIcon()==star){
          b16.setIcon(s1);
          b12.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
    }//end of if

    if(e.getSource()==b13){
      Icon s1=b13.getIcon();
        if(b9.getIcon()==star){
          b9.setIcon(s1);
          b13.setIcon(star);
        } 
        else if(b14.getIcon()==star){
          b14.setIcon(s1);
          b13.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
    }//end of if

    if(e.getSource()==b14){
      Icon s1=b14.getIcon();
        if(b10.getIcon()==star){
          b10.setIcon(s1);
          b14.setIcon(star);
        } 
        else if(b13.getIcon()==star){
          b13.setIcon(s1);
          b14.setIcon(star);
        }
        else if(b15.getIcon()==star){
          b15.setIcon(s1);
          b14.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
    }//end of if

    if(e.getSource()==b15){
      Icon s1=b15.getIcon();
        if(b14.getIcon()==star){
          b14.setIcon(s1);
          b15.setIcon(star);
        } 
        else if(b11.getIcon()==star){
          b11.setIcon(s1);
          b15.setIcon(star);
        }
        else if(b16.getIcon()==star){
          b16.setIcon(s1);
          b15.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
    }//end of if

    if(e.getSource()==b16){
      Icon s1=b16.getIcon();
        if(b12.getIcon()==star){
          b12.setIcon(s1);
          b16.setIcon(star);
        } 
        else if(b15.getIcon()==star){
          b15.setIcon(s1);
          b16.setIcon(star);
        }
      score++; // Increment score for every move
      l4.setText("Langkah : " + score); // Update score label
    }//end of if

////////////////////////////////////////////////////////////////////////////////////
  if(e.getSource()==sample){
    Icon s1=sample.getIcon();
    if(s1==samicon4){
      sample.setIcon(samicon1);
      b1.setIcon(ic1);
      b2.setIcon(ic2);
      b3.setIcon(ic3);
      b4.setIcon(ic4);
      b5.setIcon(ic5);
      b6.setIcon(ic6);
      b7.setIcon(ic7);
      b8.setIcon(ic8);
      b9.setIcon(ic9);
      b10.setIcon(ic10);
      b11.setIcon(ic11);
      b12.setIcon(ic12);
      b13.setIcon(ic13);
      b14.setIcon(ic14);
      b15.setIcon(ic15);
      b16.setIcon(ic16);

      secondsHolder[0] = 0;
      star=b9.getIcon();
      starB.setIcon(ic0);
    }//eof if
    else if(s1==samicon1){
      sample.setIcon(samicon2);
      b1.setIcon(ic18);
      b2.setIcon(ic19);
      b3.setIcon(ic20);
      b4.setIcon(ic21);
      b5.setIcon(ic22);
      b6.setIcon(ic23);
      b7.setIcon(ic24);
      b8.setIcon(ic25);
      b9.setIcon(ic26);
      b10.setIcon(ic27);
      b11.setIcon(ic28);
      b12.setIcon(ic29);
      b13.setIcon(ic30);
      b14.setIcon(ic31);
      b15.setIcon(ic32);
      b16.setIcon(ic33);

      secondsHolder[0] = 0;
      star=b9.getIcon();
      starB.setIcon(ic17);
    }//eof else
    else if(s1==samicon2){
      sample.setIcon(samicon3);
      b1.setIcon(ic35);
      b2.setIcon(ic36);
      b3.setIcon(ic37);
      b4.setIcon(ic38);
      b5.setIcon(ic39);
      b6.setIcon(ic40);
      b7.setIcon(ic41);
      b8.setIcon(ic42);
      b9.setIcon(ic43);
      b10.setIcon(ic44);
      b11.setIcon(ic45);
      b12.setIcon(ic46);
      b13.setIcon(ic47);
      b14.setIcon(ic48);
      b15.setIcon(ic49);
      b16.setIcon(ic50);

      secondsHolder[0] = 0;
      star=b9.getIcon();
      starB.setIcon(ic34);
    }//eof else
    else{
      sample.setIcon(samicon4);
      b1.setIcon(ic52);
      b2.setIcon(ic53);
      b3.setIcon(ic54);
      b4.setIcon(ic55);
      b5.setIcon(ic56);
      b6.setIcon(ic57);
      b7.setIcon(ic58);
      b8.setIcon(ic59);
      b9.setIcon(ic60);
      b10.setIcon(ic61);
      b11.setIcon(ic62);
      b12.setIcon(ic63);
      b13.setIcon(ic64);
      b14.setIcon(ic65);
      b15.setIcon(ic66);
      b16.setIcon(ic67);
      
      secondsHolder[0] = 0;
      star = b9.getIcon();
      starB.setIcon(ic51); // Ganti dengan ikon yang sesuai untuk kondisi baru ini
    }
    

  }

}//end of actionPerformed

  public static void main(String args[]){
    new picpuzzle2();
  }//end of main

}//end of class