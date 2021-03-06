import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class StatEqItPanel extends JFrame
{
    JButton Sword = new JButton("Sword");
    JButton Shield = new JButton("Shield");
    JButton Helmet = new JButton("Helmet");
    JButton Chest = new JButton("Chest");
    JButton Legs  = new JButton("Legs");
    JButton Amulet = new JButton("Amulet");
    JButton Hands = new JButton("Hands");
    JButton Belt  = new JButton("Belt");
    JButton Ring1 = new JButton("Ring 1");
    JButton Ring2 = new JButton("Ring 2");
    JButton Feet  = new JButton("Feet");
    
    // Add all Labels
    JButton Item = new JButton("Item");
    JButton Description = new JButton("Description");
    JButton Speed = new JButton("Speed");
    JButton Damage = new JButton("Damage");
    JButton Defense = new JButton("Defense"); 
    JButton Element = new JButton("Element");
    JButton Power = new JButton("Power");
    //------------------------------------------
    JButton Stats = new JButton("Statistics");
    JButton ItemD = new JButton("-");
    JButton DescriptionD = new JButton("-");
    JButton SpeedD = new JButton("-");
    JButton DamageD = new JButton("-");
    JButton DefenseD = new JButton("-"); 
    JButton ElementD = new JButton("-");
    JButton PowerD = new JButton("-");
    //-------------------------------------------
    JButton Strength = new JButton("Strength");
    JButton Stamina = new JButton("Stamina");
    JButton Mind = new JButton("Mind");
    JButton Intelligence = new JButton("Intelligence");
    JButton DefenseStat  = new JButton("Defense");
    //-------------------------------------------
    JButton SkillPoints = new JButton("Skill Points");
    int skillPoints = 4;
    int strengthPoints = 21;
    int staminaPoints = 23;
    int mindPoints = 12;
    int intelligencePoints = 17;
    int defensePoints = 32;
    //-------------------------------------------
    JButton StrengthD = new JButton("");
    JButton StaminaD = new JButton("");
    JButton MindD = new JButton("");
    JButton IntelligenceD  = new JButton("");
    JButton DefenseDStat   = new JButton("");
    JButton SkillPointsD = new JButton("+1");
    
    //-------------------------------------------
    JButton StrengthPlus = new JButton("+1");
    JButton StaminaPlus = new JButton("+1");
    JButton MindPlus = new JButton("+1");
    JButton IntelligencePlus = new JButton("+1");
    JButton DefensePlus = new JButton("+1");
    //------------------------------------------
    JButton Unequip = new JButton("UNEQUIP");
    //------------------------------------------
    //Backpack Panel
    //------------------------------------------
    JButton Title = new JButton("Inventory");
    JButton IWeapon = new JButton("Weapons");
    JButton IArmor = new JButton("Armor");
    JButton IRings = new JButton("Rings");
    JButton IPotion = new JButton("Potions");
    JButton IShield = new JButton("Shield");
    
    JButton IItem = new JButton("Item");
    JButton IDescription = new JButton("Description");
    JButton IItemD = new JButton();
    JButton IDescriptionD = new JButton();
    
    JButton IDamage  = new JButton("Damage");
    JButton ISpeed   = new JButton("Speed");
    JButton IDefense = new JButton("Defense");
    JButton IElement = new JButton("Element");
    JButton IPower   = new JButton("Power");
    
    JButton IDamageD  = new JButton("1");
    JButton ISpeedD   = new JButton("2");
    JButton IDefenseD = new JButton("3");
    JButton IElementD = new JButton("4");
    JButton IPowerD   = new JButton("5");
    
    JButton IEquip   = new JButton("EQUIP");
    
    
    DefaultListModel item = new DefaultListModel();
    JList itemList = new JList(item);
    JScrollPane scroll = new JScrollPane(itemList);
    JTabbedPane jtp;
    
    public StatEqItPanel() 
    {
       // Set up the frame  
       setTitle("Character");
       setSize(530,450);
       setBackground(Color.DARK_GRAY);
       
       // Creating tabs
       jtp = new JTabbedPane();
       getContentPane().add(jtp);
       
       
       JPanel StatsPanel = new JPanel();//First Panel
       JPanel EquipmentPanel = new JPanel();//Second Panel
       JPanel BackpackPanel = new JPanel();//Third Panel
       
       

        
       //Tab Creation
       jtp.addTab("Stats",StatsPanel);
       jtp.addTab("Equipment", EquipmentPanel);
       jtp.addTab("Backpack", BackpackPanel);
 
       StatsPanel.setLayout(null);      //Custom button placement for first panel
       EquipmentPanel.setLayout(null);  //Reference line above, but for second panel
       BackpackPanel.setLayout(null);   //Backpack layout manager set to null
       
       
       StrengthD.setText(String.valueOf(strengthPoints));
       StaminaD.setText(String.valueOf(staminaPoints));
       IntelligenceD.setText(String.valueOf(intelligencePoints));
       MindD.setText(String.valueOf(mindPoints));
       DefenseDStat.setText(String.valueOf(defensePoints));
       SkillPointsD.setText(String.valueOf(skillPoints));
       
       
       //---------------------------
       // SIZES
       //---------------------------
       
       //Stats Panel 1 Buttons Sizes
       Strength.setSize(200,40);
       Stamina.setSize(200,40);
       Intelligence.setSize(200,40);
       Mind.setSize(200,40);
       DefenseStat.setSize(200,40);
       //----------------------------
       StrengthD.setSize(110,40);
       StaminaD.setSize(110,40);
       IntelligenceD.setSize(110,40);
       MindD.setSize(110,40);
       DefenseDStat.setSize(110,40);
       //-----------------------------
       StrengthPlus.setSize(50,40);
       StaminaPlus.setSize(50,40);
       IntelligencePlus.setSize(50,40);
       MindPlus.setSize(50,40);
       DefensePlus.setSize(50,40);
       //-----------------------------
       SkillPoints.setSize(200,40);
       SkillPointsD.setSize(75,40);
       //-----------------------------
       Unequip.setSize(200,50);
         
       
       //Equipment Panel 2 Buttons Sizes
       Sword.setSize(80,80);
       Shield.setSize(80,80);
       Helmet.setSize(80,50);
       Chest.setSize(80,70);
       Legs.setSize(80,70);
       Amulet.setSize(80,50);
       Belt.setSize(80,40);
       Hands.setSize(80,60);
       Ring1.setSize(80,35);
       Ring2.setSize(80,35);
       Feet.setSize(80,50);
       //-------------------------
       Stats.setSize(212,30);
       Item.setSize(500,30);
       Description.setSize(500,30);
       Speed.setSize(125, 20);
       Damage.setSize(125, 20);
       Defense.setSize(125, 20);
       Element.setSize(125, 20); 
       Power.setSize(125, 20);
       //-------------------------
       ItemD.setSize(500,20);
       DescriptionD.setSize(500,20);
       SpeedD.setSize(87,20);
       DamageD.setSize(87,20);
       DefenseD.setSize(87,20);
       ElementD.setSize(87,20);
       PowerD.setSize(87,20);
       //--------------------
       //Panel 3
       //--------------------
       scroll.setSize(250,200);
       
       Title.setSize(250,50);
       IWeapon.setSize(100,40);
       IArmor.setSize(100,40);
       IRings.setSize(100,40);
       IPotion.setSize(100,40);
       IShield.setSize(100,40);
       
       IItem.setSize(500,30);
       IDescription.setSize(500,30);
       IItemD.setSize(500,20);
       IDescriptionD.setSize(500,20);
       
       IDamage.setSize(100,20);
       ISpeed.setSize(100,20);
       IDefense.setSize(100,20);
       IElement.setSize(100,20);
       IPower.setSize(100,20);
       
       IDamageD.setSize(100,20);
       ISpeedD.setSize(100,20);
       IDefenseD.setSize(100,20);
       IElementD.setSize(100,20);
       IPowerD.setSize(100,20);
       
       IEquip.setSize(120,40);
       
       //------------------------------------
       // LOCATION
       //------------------------------------
       Sword.setLocation(10,10);
       Shield.setLocation(10,95);
       Helmet.setLocation(100,10);
       Chest.setLocation(100,70);
       Legs.setLocation(100,145);
       Amulet.setLocation(190,10);
       Hands.setLocation(190,70);
       Belt.setLocation(190,135);
       Ring1.setLocation(190,180);
       Ring2.setLocation(10,180);
       Feet.setLocation(100,220); 
       Unequip.setLocation(285,180);  
       //-----------------------------
       Item.setLocation(0,280);
       Description.setLocation(0,330);
       //------------------------------
       ItemD.setLocation(0,310);
       DescriptionD.setLocation(0,360);
       //------------------------------
       Stats.setLocation(280,30);
       //------------------------------
       Speed.setLocation(280,60);
       Damage.setLocation(280,80);
       Defense.setLocation(280,100);
       Element.setLocation(280,120);
       Power.setLocation(280,140);
      
       SpeedD.setLocation(405,60);
       DamageD.setLocation(405,80);
       DefenseD.setLocation(405,100);
       ElementD.setLocation(405,120);
       PowerD.setLocation(405,140);
       //-----------------------------------
       Strength.setLocation(50,10);
       Stamina.setLocation(50,70);
       Mind.setLocation(50,130);
       Intelligence.setLocation(50,190);
       DefenseStat.setLocation(50,250);
       //-----------------------------------
       StrengthD.setLocation(255,10);
       StaminaD.setLocation(255,70);
       MindD.setLocation(255,130);
       IntelligenceD.setLocation(255,190);
       DefenseDStat.setLocation(255,250);
       //-----------------------------------
       StrengthPlus.setLocation(370,10);
       StaminaPlus.setLocation(370,70);
       MindPlus.setLocation(370,130);
       IntelligencePlus.setLocation(370,190);
       DefensePlus.setLocation(370,250);
       //----------------------------------
       SkillPoints.setLocation(100,300);
       SkillPointsD.setLocation(300,300);
       //-----------------------------------
       scroll.setLocation(125,60);
       
       Title.setLocation(125,10);
       
       IWeapon.setLocation(10,10);
       IArmor.setLocation(10,60);
       IRings.setLocation(10,110);
       IPotion.setLocation(10,160);
       IShield.setLocation(10,210);
       
       IItem.setLocation(0,270);
       IItemD.setLocation(0,300);
       IDescription.setLocation(0,320);
       IDescriptionD.setLocation(0,350);
       
       IDamage.setLocation(400,10);
       IDamageD.setLocation(400,30);
       
       ISpeed.setLocation(400,50);
       ISpeedD.setLocation(400,70);
       
       IDefense.setLocation(400,90);
       IDefenseD.setLocation(400,110);
       
       IElement.setLocation(400,130);
       IElementD.setLocation(400,150);
       
       IPower.setLocation(400,170);
       IPowerD.setLocation(400,190);
       
       IEquip.setLocation(380,220);
       //------------------------------------
       // COLORS
       //------------------------------------
       // PANEL 1
       Strength.setBackground(Color.yellow);
       Stamina.setBackground(Color.yellow);
       Intelligence.setBackground(Color.yellow);
       Mind.setBackground(Color.yellow);
       DefenseStat.setBackground(Color.yellow);
       SkillPoints.setBackground(Color.orange);
       //-------------------------------------
       SkillPointsD.setBackground(Color.orange);
       StrengthPlus.setBackground(Color.red);
       StaminaPlus.setBackground(Color.red);
       IntelligencePlus.setBackground(Color.red);
       DefensePlus.setBackground(Color.red);
       MindPlus.setBackground(Color.red);
       //-------------------------------------
       StrengthPlus.setForeground(Color.white);
       StaminaPlus.setForeground(Color.white);
       IntelligencePlus.setForeground(Color.white);
       DefensePlus.setForeground(Color.white);
       MindPlus.setForeground(Color.white);
       //-------------------------------------
       Item.setForeground(Color.black);
       Description.setForeground(Color.black);
       Speed.setForeground(Color.black);
       Damage.setForeground(Color.black);
       Defense.setForeground(Color.black);
       Element.setForeground(Color.black);
       Power.setForeground(Color.black);
       //-------------------------------------
       
       // PANEL 2
       Sword.setBackground(Color.LIGHT_GRAY);
       Shield.setBackground(Color.LIGHT_GRAY);
       Helmet.setBackground(Color.LIGHT_GRAY);
       Chest.setBackground(Color.LIGHT_GRAY);
       Legs.setBackground(Color.LIGHT_GRAY);
       Amulet.setBackground(Color.LIGHT_GRAY);
       Belt.setBackground(Color.LIGHT_GRAY);
       Hands.setBackground(Color.LIGHT_GRAY);
       Ring1.setBackground(Color.LIGHT_GRAY);
       Ring2.setBackground(Color.LIGHT_GRAY);
       Feet.setBackground(Color.LIGHT_GRAY);
       //----------------------------------
       Stats.setBackground(Color.orange);
       Item.setBackground(Color.ORANGE);
       Description.setBackground(Color.ORANGE);
       Speed.setBackground(Color.yellow);
       Damage.setBackground(Color.YELLOW);
       Defense.setBackground(Color.YELLOW);
       Element.setBackground(Color.YELLOW);
       Power.setBackground(Color.YELLOW);
       //----------------------------------
       Unequip.setBackground(Color.orange);
       

       //---------------------------------
       //ADD TO PANEL
       //---------------------------------
       StatsPanel.add(Strength);
       StatsPanel.add(Stamina);
       StatsPanel.add(Mind);
       StatsPanel.add(Intelligence);
       StatsPanel.add(DefenseStat);
       //--------------------------
       StatsPanel.add(StrengthD);
       StatsPanel.add(StaminaD);
       StatsPanel.add(MindD);
       StatsPanel.add(IntelligenceD);
       StatsPanel.add(DefenseDStat);
       //--------------------------
       StatsPanel.add(StrengthPlus);
       StatsPanel.add(StaminaPlus);
       StatsPanel.add(MindPlus);
       StatsPanel.add(IntelligencePlus);
       StatsPanel.add(DefensePlus);
       //--------------------------
       StatsPanel.add(SkillPoints);
       StatsPanel.add(SkillPointsD);
       
       
       //PANEL 2
       EquipmentPanel.add(Sword);
       EquipmentPanel.add(Shield);
       EquipmentPanel.add(Helmet);
       EquipmentPanel.add(Chest);
       EquipmentPanel.add(Legs);
       EquipmentPanel.add(Amulet);
       EquipmentPanel.add(Hands);
       EquipmentPanel.add(Belt);
       EquipmentPanel.add(Ring1);
       EquipmentPanel.add(Ring2);
       EquipmentPanel.add(Feet);
       //---------------------------
       EquipmentPanel.add(Stats);
       EquipmentPanel.add(Item);
       EquipmentPanel.add(Description); 
       EquipmentPanel.add(Speed);
       EquipmentPanel.add(Damage);
       EquipmentPanel.add(Defense);
       EquipmentPanel.add(Element);
       EquipmentPanel.add(Power);
       //---------------------------
       EquipmentPanel.add(ItemD);
       EquipmentPanel.add(DescriptionD); 
       EquipmentPanel.add(SpeedD);
       EquipmentPanel.add(DamageD);
       EquipmentPanel.add(DefenseD);
       EquipmentPanel.add(ElementD);
       EquipmentPanel.add(PowerD);
       EquipmentPanel.add(Unequip);

       BackpackPanel.add(scroll);
       
       BackpackPanel.add(Title);
       BackpackPanel.add(IWeapon);
       BackpackPanel.add(IArmor);
       BackpackPanel.add(IRings);
       BackpackPanel.add(IShield);
       BackpackPanel.add(IItem);
       BackpackPanel.add(IDescription);
       BackpackPanel.add(IItemD);
       BackpackPanel.add(IDescriptionD);
       BackpackPanel.add(IPotion);
       
       BackpackPanel.add(IDamage);
       BackpackPanel.add(ISpeed);
       BackpackPanel.add(IDefense);
       BackpackPanel.add(IElement);
       BackpackPanel.add(IPower);
       
       BackpackPanel.add(IDamageD);
       BackpackPanel.add(ISpeedD);
       BackpackPanel.add(IDefenseD);
       BackpackPanel.add(IElementD);
       BackpackPanel.add(IPowerD);
       
       BackpackPanel.add(IEquip);

        //-----------------------------------
        // ADD ACTION LISTENERS
        //-----------------------------------
       
        // Create action listener and Button Handler
        ButtonHandler phandler = new ButtonHandler();
        Sword.addActionListener(phandler);
        Shield.addActionListener(phandler);
        Helmet.addActionListener(phandler);
        Chest.addActionListener(phandler);
        Legs.addActionListener(phandler);
        Amulet.addActionListener(phandler);
        Hands.addActionListener(phandler);
        Belt.addActionListener(phandler);
        Ring1.addActionListener(phandler);
        Ring2.addActionListener(phandler);
        Feet.addActionListener(phandler);
        Unequip.addActionListener(phandler);
        StrengthPlus.addActionListener(phandler);
        StaminaPlus.addActionListener(phandler);
        MindPlus.addActionListener(phandler);
        IntelligencePlus.addActionListener(phandler);
        DefensePlus.addActionListener(phandler);
        SkillPointsD.addActionListener(phandler);
        
        IWeapon.addActionListener(phandler);
        IArmor.addActionListener(phandler);
        IRings.addActionListener(phandler);
        IPotion.addActionListener(phandler);
        IShield.addActionListener(phandler);
        
        setVisible(true);
       
    }
    
    class ButtonHandler implements ActionListener
    {
           public void actionPerformed(ActionEvent e)
           {
        	   if(e.getSource() != Unequip)
        	   {
        	   Sword.setBackground(Color.LIGHT_GRAY);
        	    Shield.setBackground(Color.LIGHT_GRAY);
        	    Helmet.setBackground(Color.LIGHT_GRAY);
        	    Chest.setBackground(Color.LIGHT_GRAY);
        	    Legs.setBackground(Color.LIGHT_GRAY);
        	    Amulet.setBackground(Color.LIGHT_GRAY);
        	    Belt.setBackground(Color.LIGHT_GRAY);
        	    Hands.setBackground(Color.LIGHT_GRAY);
        	    Ring1.setBackground(Color.LIGHT_GRAY);
        	    Ring2.setBackground(Color.LIGHT_GRAY);
        	    Feet.setBackground(Color.LIGHT_GRAY);
        	   }
        		if(e.getSource() == Sword)
        		{
        		Sword.setBackground(Color.yellow);
        	    ItemD.setText("Unarmed");
        	    DescriptionD.setText("You don't have a Sword.");
        	    SpeedD.setText("0");
        	    DamageD.setText("0");
        	    DefenseD.setText("-");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Shield)
        		{
        		Shield.setBackground(Color.yellow);
        	    ItemD.setText("Unarmed");
        	    DescriptionD.setText("You don't have a shield.");
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    DefenseD.setText("0");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Helmet)
        		{
        		Helmet.setBackground(Color.yellow);
        	    ItemD.setText("Headless");
        	    DescriptionD.setText("You don't have a helmet.");
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    DefenseD.setText("0");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Chest)
        		{
        		Chest.setBackground(Color.yellow);
        	    ItemD.setText("Shirtless");
        	    DescriptionD.setText("You don't have a curiass.");
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    DefenseD.setText("0");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Legs)
        		{
        		Legs.setBackground(Color.yellow);
        	    ItemD.setText("None");
        	    DescriptionD.setText("You are lacking greaves.");
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    DefenseD.setText("0");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Amulet)
        		{
        		Amulet.setBackground(Color.yellow);
        	    ItemD.setText("None");
        	    DescriptionD.setText("You don't have an amulet.");
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    DefenseD.setText("-");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Belt)
        		{
        		Belt.setBackground(Color.yellow);
        	    ItemD.setText("None");
        	    DescriptionD.setText("How are you going to keep your pants up now?");
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    DefenseD.setText("-");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Hands)
        		{
        		Hands.setBackground(Color.yellow);
        	    ItemD.setText("None");
        	    DescriptionD.setText("Caught bare handed.");
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    DefenseD.setText("0");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Ring1)
        		{
        	    Ring1.setBackground(Color.yellow);
        	    ItemD.setText("None");
        	    DescriptionD.setText("Still single.");
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    DefenseD.setText("-");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Ring2)
        		{
        	    Ring2.setBackground(Color.yellow);
        	    ItemD.setText("None");
        	    DescriptionD.setText("Ringless.");
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    DefenseD.setText("-");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Feet)
        		{
        	    Feet.setBackground(Color.yellow);
        	    ItemD.setText("None");
        	    DescriptionD.setText("You are barefoot.");
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    DefenseD.setText("0");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		////////////STATS\\\\\\\\\\\\\\\\\
        		if(e.getSource() == StrengthPlus)
        		{
        		if(skillPoints > 0)
        		{
        		skillPoints --;
        		strengthPoints ++;
        		}

        	    }
        		
        		if(e.getSource() == StaminaPlus)
        		{
        		if(skillPoints > 0)
            		{
            		skillPoints --;
            		staminaPoints ++;
            		}
        	    }
        		
        		if(e.getSource() == IntelligencePlus)
        		{
        			if(skillPoints > 0)
            		{
            		skillPoints --;
            		intelligencePoints ++;
            		}
        	    }
        		
        		if(e.getSource() == MindPlus)
        		{
        			if(skillPoints > 0)
            		{
            		skillPoints --;
            		mindPoints ++;
            		}
            	
        	    }
    
        		if(e.getSource() == DefensePlus)
        		{
        			if(skillPoints > 0)
            		{
            		skillPoints --;
            		defensePoints ++;
            		}
        		
        	    }
        		if(skillPoints == 0)
        		{
        		StrengthPlus.setEnabled(false);
        		StaminaPlus.setEnabled(false);
        		IntelligencePlus.setEnabled(false);
        		MindPlus.setEnabled(false);
        		DefensePlus.setEnabled(false);
        		SkillPointsD.setEnabled(false);
        		SkillPoints.setEnabled(false);
        		
        		StrengthPlus.setBackground(Color.gray);
        		StaminaPlus.setBackground(Color.gray);
        		IntelligencePlus.setBackground(Color.gray);
        		MindPlus.setBackground(Color.gray);
        		DefensePlus.setBackground(Color.gray);
        		SkillPointsD.setBackground(Color.gray);
        		SkillPoints.setBackground(Color.gray);
        		}
        		   
        		   StrengthD.setText(String.valueOf(strengthPoints));
        	       StaminaD.setText(String.valueOf(staminaPoints));
        	       IntelligenceD.setText(String.valueOf(intelligencePoints));
        	       MindD.setText(String.valueOf(mindPoints));
        	       DefenseDStat.setText(String.valueOf(defensePoints));
        	       SkillPointsD.setText(String.valueOf(skillPoints));
           //////////////BACKPACK\\\\\\\\\\\\

           if(e.getSource() == IWeapon)
           {
           Title.setText("Weapons");
           item.clear();
           item.addElement("Mace");
           item.addElement("Axe");
           }
           
           if(e.getSource() == IArmor)
           {
           Title.setText("Armor");
           item.clear();
           item.addElement("Curiass");
           item.addElement("Bulletproof Vest");
           }
           
           if(e.getSource() == IRings)
           {
           Title.setText("Rings");
           item.clear();
           item.addElement("Golden Ring of Fire");
           item.addElement("Silver Ring of Healing");
           }
           
           if(e.getSource() == IPotion)
           {
           Title.setText("Potions");
           item.clear();
           item.addElement("Potion of Healing");
           item.addElement("Potion of Mana");
           }
           
           if(e.getSource() == IShield)
           {
           Title.setText("Shields");
           item.clear();
           item.addElement("Riot Shield");
           item.addElement("Buckler");
           item.addElement("Agis");
           }
       }
           
    }


}

