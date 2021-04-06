
	package Chatbot;

	/**
	 *
	 * @author Sheikh Mesba Ul Hekam
	 */
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;

	public class UTMChatbot extends JFrame {

	    /**
	     * @param args the command line arguments
	     */
	        //Typing Area:
	    
	    private JTextField txtEnter = new JTextField();
	    JPanel p=new JPanel();
	    	//JTextArea dialog=new JTextArea(20,50);
		//JTextArea input=new JTextArea(1,50);
		//JScrollPane scroll=new JScrollPane(
	   
	    //Chat Area:
	    private JTextArea txtChat = new JTextArea(20,50);
	    
	    public UTMChatbot() {
	        //Frame Attributes:
	        //JLabel background;
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(1050,580);
	        this.setVisible(true);
	        this.setResizable(false);
	        this.setLayout(null);
	        this.setTitle("UTM ChatBot");
	        getContentPane().setForeground( Color.RED );
	        

	        
	       // getContentPane().setBackground(Color.blue);
	        
	        
	        this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Study\\2nd year 1st semester\\Object Oriented Programming\\Chatbot\\utm.jpg"));

	        setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("D:\\Study\\2nd year 1st semester\\Object Oriented Programming\\Chatbot\\admission.jpg"));
	        
		add(background);
	        
		setVisible(true);
	       
	       
	        //txtEnter Attributes:
	        txtEnter.setLocation(2, 480);
	        txtEnter.setSize(590, 30);
	       
	        //txtEnter Action Event:
	    
	    txtEnter.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                String uText = txtEnter.getText();;
	                txtChat.append("  --> You:   " + uText + "\n");
	                String s;
	               
	                if(uText.contains("Hi")){
	                    botSay("Hello there!");
	                }
	       else if(uText.contains("How are you?")){
	                    int decider = (int) (Math.random()*2+1);
	                    if(decider == 1){
	                        botSay("I'm doing well, thanks");
	                    }
	                    else if(decider == 2){
	                        botSay("Not too bad");
	                    }
	                }
	                else if(uText.contains("hi")){
	                    botSay("Hello There ");
	                }
	                else if(uText.contains("Hello")){
	                    botSay("Hi There ");
	                }
	                else if(uText.contains("hello")){
	                    botSay("Hi There ");
	                }
	                else if(uText.contains("Hello")){
	                    botSay("Hi There ");
	                }
	                else if(uText.contains("I want to take admission in UTM")){
	                    botSay("Well, Very Good");
	                }
	                else if(uText.contains("May I know admission recruitment for UTM?")){
	                    botSay("yes sure. where are u from?");
	                }
	                else if(uText.contains("Bangladesh")){
	                    botSay("If you are from Bangladesh for undergraduate, You Should have 80% marks in Physics"+
	                    		"\n"+ "Chemistry and Math in your Higher secondery school certificate");
	                }
	                else if(uText.contains("How is UTM?")){
	                    botSay("Universiti Teknologi Malaysia (UTM) is a Malaysian public research-intensive university in engineering, science and technology located in Skudai,"+ 
	                         "\n" +" Johor and it has a branch campus in Kuala Lumpur. UTM is a graduate-focused university with 56% of its student population consisting of postgraduate students," + 
	                    		"\n"+ " the highest in Malaysia. As of 2015, UTM has more than 5,000 international students from more than 120 countries, the highest research university in Malaysia.");
	                    }else if(uText.contains("Where is UTM?")){
		                    botSay("UTM has 2 campus in  Johor Bahru & Kuala Lumpur. The main campus is in Johor Bahru (the southern most state of Malaysia) and about 300 km "+ 
			                         "\n" +" south of Kuala Lumpur.  UTM Kuala Lumpur Campus is located in centered of Kuala Lumpur City (5km from KLCC). Both campus  conveniently accessible by all "+
		                    		"\n"+"forms of ground and air transportation."); 
			             
			          }
	                    else if(uText.contains("How are courses assessed?")){
		                    botSay("Your course will be constructed of modules. Each module has its own assessment. This can be an examination or an essay or dissertation. There can also be continuous "+"\n"+"assessment. The precise type of assessment and its contribution to the course is clear in the course regulations");
		                }
	                    else if(uText.contains("What are the admission requirements for Undergraduate International Students?")){
		                    botSay("A Bachelor�s Degree Programme requires a good 'Advanced Level' in General Certificate of Education or equivalent"+"\n"+"While a Masters and Doctorate Programme require a good Bachelor and good Master�s Degree from an internationally recognised "+"\n"+"university, respectively.");
		                }
	                    else if(uText.contains("What do I have to do to get my foreign diploma/degree recognised by UTM?")){
		                    botSay("We require that candidate to submit an academic transcript of his/her qualification/certificate endorsed by the "+"\n"+"respective school/university. Foreign diplomas and degrees will be evaluated by the respective faculty�s admission committee.");
		                }
	                    else if(uText.contains("What kind of accommodation facilities do you have for single and/or married students?")){
		                    botSay("There are 11 residential colleges which can accommodate about 17,000 students. Married house apartment"+"\n"+" although more limited in numbers are available for postgraduates student who wish to bring along their family. Students are "+"\n"+"advised to contact the Student Affairs Department for more information.");
	                    }
	                    else if(uText.contains("What other social and recreational amenities available in and outside the campus?")){
		                    botSay("UTM has many sports and recreational facilities, both indoors and outdoors such as soccer stadium, hockey, "+"\n"+"tennis, criket, equestrian, kayaking, badminton, and Olympic sized swimming pool. These facilities will be supplemented by some "+"\n"+"public and privately funded facilities available outside the campus. Students are encouraged to join the many student clubs and social activities "+"\n"+"in the campus. The sports unit is available to help organise and oversee sports functions and competitions.");
	                    }
		                    else if(uText.contains("What is the main determinant of the External Program Fees?")){
		                    botSay("The fees for the external program are based on the number of the students enrolled in the particular program. Generally,"+"\n"+" the fees will be lower if the student�s number is bigger. Other factors, such as the rental cost for the infrastructure, study mode, and"+"\n"+" the number of supervisions for the project/theses.");
		                }
	                    else if(uText.contains("Are there any financial assistants for External Programs students?")){
		                    botSay(" Students can pay fees by installments by referring to the payment schedule attached to the offer letter. Students can also write personal check or pay "+"\n"+"electronically to the UTM Bursar. The information regarding payment methods is provided along with the offer letter.");
		                }
	                    else if(uText.contains("What is the consequence of not paying the fees?")){
		                    botSay("SPS provides the students with flexible installment schedule, which enable them to settle their fees throughout the semesters according "+"\n"+"to their financial capability. However, failure to adhere to the schedules may result in difficulty to register courses or being"+"\n"+" barred from sitting in the examination or their results cannot be released d, and would not be able to graduate on time until the outstanding amount being settled.");
		                }
	                    else if(uText.contains("Can the fees be reimbursed in case of failure in study?")){
		                    botSay("The fees already paid will not be reimbursed in case of students fail the courses/program. Students may apply to repeat the course "+"\n"+"or programme re-registration (whichever applicable) depending on provisions provided in the graduate rules and regulation. In case "+"\n"+"of program re-registration, the fees will have to be recalculated and students will have to pay again full fees based on the current rates."
		                    		+ "The external program students are given a 2-year study package for master level, and a 4-year study package for doctoral level. If the study duration exceeds the maximum duration provided for the package, students may continue (depending on the external "+"\n"+"programme�s availability) but will have to pay extra for additional semester(s) involved. Other than that, charges (per credit registered)"+"\n"+" will also apply in case of repeating the course (either in or outside the package) as regulated by the UTM Bursar.");
		                }
	                    else if(uText.contains("Where are the lectures conducted?")){
		                    botSay("The lectures are conducted at selected learning centers throughout Malaysia (including Sabah and Sarawak). The selections of these centers are based on demand "+"\n"+"or suggestion from candidates of that location, the number of students at that particular location, the rental cost, and other"+"\n"+" strategic reasons.");
		                }
	                    else if(uText.contains("May I know admission recruitment for UTM?Do the students need to go to UTM Campus?")) {
		                    botSay("The learning activities for the External Program are conducted at the learning centers, including the lectures and theses/project supervisions. However, "+"\n"+"students can also access references such as journals and articles related to their fields through the UTM Library databases."+"\n"+" Nevertheless, students are encouraged to visit UTM Campuses at their convenience for any particular reason.(make sure you bring your students"+"\n"+" matriculation card for identification purpose");
		                }
	                    else if(uText.contains("When are the lectures being held? How many credit hours?")){
		                    botSay("The lectures for the external programs are conducted during weekends (Saturdays and Sundays). The number of lecture hours for 3-credits course"+"\n"+" are 42 hours, while for 4-credits course the lecture hours are 56.9.");
		                }
	                    else if(uText.contains("Where can I get the lecture schedule?")){
		                    botSay("The lecture schedule for a particular semester is prepared by the Coordinator of that particular programme, at the beginning of the semester. Students may contact"+"\n"+" him/her directly to obtain the schedule and related information pertaining to the programme.");
		                }
	                    else if(uText.contains("Do I have to attend all the lectures?")){
		                    botSay("Students must attend at least 80% of the lecture meetings. This is essential to ensure students have received adequate knowledge and exposures, before sitting for"+"\n"+" the final exam. In case of non complience of this attendance requirement, students will be barred from sitting in the"+"\n"+" final examination.");
		                }
	                    else if(uText.contains("What needs to be done if I cannot attend the lectures?")){
		                    botSay("Students will have to inform the lecturer in case of absence. If the attendance are lower than the 80% requirement, student can discuss with the"+"\n"+" lecturer through the selected leader of the students group. Normally, the lecturers will try their best to accommodate "+"\n"+"students� needs and come out with the best solution to resolve the issue.");
		                }
	                    else if(uText.contains("What is VAL?")){
		                    botSay("Visa Approval Letter or VAL is an official signed and stamped document issued by the Department of Immigration Malaysia confirming that the named person \r\n" + 
		                    		"has been approved to enter Malaysia for the purposes of study.\r\n" + 
		                    		" Students from the countries which require a visa and also have a Malaysian Embassy must obtain visa prior to their entry into Malaysia. Students must also produce the \r\n" + 
		                    		"�Visa Approval Letter� (VAL) upon entry before entering Malaysia. Students from the countries which require a visa but do not have a Malaysian Embassy are permitted to enter\r\n" + 
		                    		" without visa. Students must produce the �Visa Approval Letter� (VAL) upon entry.Students from the countries which do not require a visa to enter Malaysia may proceed to enter\r\n" + 
		                    		" by producing the �Visa Approval Letter� (VAL) upon arrival. Please ensure that you check with the Malaysian Embassy at your country before finalizing your travel plans.\r\n" + 
		                    		" UTM advises you must ensure you have sufficient time to process the Student Pass and recommends you apply for a visa before leaving your home country, for a minimum \r\n" + 
		                    		"of 30 days to ensure you have as much  time as possible to process your Student Pass and complete your medical check-up on arrival. Check the Department of\r\n" + 
		                    		" Immigration for the latest visa requirements:http://www.imi.gov.my/index.php/en/");
		                }
	                    else if(uText.contains("How long it will take to get VAL?")){
		                    botSay("It should take 4 � 6 weeks   upon receipt of a complete application and payment to EMGS. Student have to apply VAL  online at https://educationmalaysia.gov.my/");
		                }
	                    else if(uText.contains("When and how can I pay for my VAL & Processing fee?")){
		                    botSay("'There are 2 payment options:\r\n" + 
		                    		"\r\n" + 
		                    		"    Online payment using a Visa or MasterCard on the educationmalaysia.gov.my website."+"\n"+"  Online payment method is only applicable for students have made an online application via EMGS website.\r\n" + 
		                    		"    Pay Through  institution: Pay direct to EMGS bank account  via Telegraphic Transfer.  Refer to http://isc.utm.my > VAL for EMGS bank account");
		                }
	                    else if(uText.contains("When is expiry of VAL?")){
		                    botSay("The Visa Approval Letter (VAL)  is only valid for 6 months from the date of issue. Students must  register to the university during this period of\r\n" + 
		                    		" validity of VAL. Failing to do so, a new VAL application has to be applied. Please check the registration date before coming to UTM.");
		                }
	                    else if(uText.contains("When  my student pass is ready?")){
		                    botSay("It should take MINIMUM 21 working days (or minimum 4 weeks)  upon receipt of a complete document and payment. The student pass application must get Supporting\r\n" + 
		                    		" Letter from EMGS prior submit to Immigration Department. Since the student pass is issued by the Immigration Department, the 21 working days is at the discretion\r\n" + 
		                    		" of the Immigration Department (sometimes can be more). Thus,  student must remains in Malaysia for a minimum 4 weeks after registration\r\n" + 
		                    		" for student pass sticker endorsement.");
		                }
	                    else if(uText.contains("Can I convert my social Pass to a student Pass?")){
		                    botSay("NO. Malaysia Immigration Department NOT ALLOWED the conversion from social pass to student pass.  All international students \r\n" + 
		                    		"(except Diplomatic pass holders, Malaysian Permanent Residents ) are required to have a student pass while studying at UTM.");
		                }
	                    else if(uText.contains("My country does not have Malaysia Embassy. How to get Single Entry Visa?")){
		                    botSay("Countries without Malaysia Embassy have to apply Visa on Arrival for Student (VOAS) at VOA Counter at Malaysia Airport Arrival Hall or entry\r\n" + 
		                    		" point by showing your VAL, Offer Letter and Passport to Immigration Officer before proceed at Immigration Counter*.\r\n" + 
		                    		"*Student from Syria, Iraq, Libya & Yemen are required to obtained SEV from Malaysia Embassy at neighbouring country before enter Malaysia");
		                }
	                    else if(uText.contains("When do I get a student pass  endorsement?")){
		                    botSay("Once you arrive in Malaysia, you will be required to attend post arrival medical screening within 3 days at UTM Health clinics. From the day your passport \r\n" + 
		                    		"is submitted at our counter, the process should take 21 working days (or 4 WEEKS). Please note that this timeline is at the discretion of the Immigration Department.");
		                }
	                    else if(uText.contains("What documents are required to apply for renewal of student pass?")){
		                    botSay("Please refer to ISC website http://isc.utm.my > Pass & Visa");
		                }
	                    else if(uText.contains("When I should renew the Student Pass?")){
		                    botSay("You should renew 3 months (90 days) before the expiry of your Student/Dependent Pass");
		                }
	                    else if(uText.contains("Can I send application for renewal of student pass 1 month before the expiry date?")){
		                    botSay("No. Kindly submit all the required documents 3 MONTH (90 days) before expiry date and submit your passport (include dependent if any) 21\r\n" + 
		                    		" working days before the student/dependent pass expiry date.");
		                }
	                    else if(uText.contains("Can I purchase air ticket before my passport ready?")){
		                    botSay("NO. Students are not allowed to purchase any flight ticket before obtaining your student pass/passport from UTM International \r\n" + 
		                    		"to avoid any problem arises afterwards. Please note it will take 5-6 weeks for renewal process.");
		                }
	                    else if(uText.contains("Can I take the passport on behalf of my friend?")){
		                    botSay("Yes, but your friend must send the authorization letter to UTM International  Officer.");
		                }
	                    else if(uText.contains("I forget my student pass expiry and I already overstayed")){
		                    botSay("All penalties imposed by the Malaysian Immigration Department in the event of late extension or expiry of student pass are to be borne by the student and\r\n" + 
		                    		" all the payment must be made through UTM Bursar. The total fine is based on days of students overstayed which is minimum fine is RM1100 and maximum "+"\n"+"is RM10,000. Then, students are required report to the immigration \r\n" + 
		                    		"office to take statement by immigration officer. Immigration Department will issue a special pass (Making arrangement to leave country) within 7 -14  days.");
		                }
	                    else if(uText.contains("What if late submission for renewal of student pass?")){
		                    botSay("Immigration  will impose a fine for late submission of renewal of student pass. If student submit within \r\n" + 
		                    		"a. 5-7 weeks before expiry � fine RM50\r\n" + 
		                    		"b. 2-4 weeks before expiry � fine RM100\r\n" + 
		                    		"c. < 0-2 weeks before expiry � fine RM150+ RM1,100 for Special Pass & Immigration compound ");
		                }
	                    else if(uText.contains("Can I get my refund of deposit for Personal Bond without cancelling my Student Pass?")){
		                    botSay("NO. As the Immigration Act, 1963, student must cancel the Student Pass and if not the refund will be forfeited");
		                }
	                    else if(uText.contains("Can I travel within Malaysia by flight if my passport still in the process for Student Pass?")){
		                    botSay("NO. student must have the original passport to travel by fight within Malaysia. Alternatively, you can travel by\r\n" + 
		                    		" Bus or other public transportation.");
		                }
	                    else if(uText.contains("My student pass has expired. What should I do?")){
		                    botSay("If you are  in Malaysia, you overstayed and will be subject to penalties imposed by the Immigration Department of Malaysia, which include detention and  fine. \r\n" + 
		                    		"If you are  outside Malaysia, do not re-enter Malaysia as a tourist via a social pass. You may be required to apply for a VAL  \r\n" + 
		                    		"prior to entering Malaysia. Please email us at iscjb@utm.my for further advice.?");
		                }
	                    else if(uText.contains("My  passport is expiring less in 1 year and will renew my passport. How about my current student pass in old passport?")){
		                    botSay("You are required to renew your passport at your embassy. Then  apply for a transfer of endorsement \r\n" + 
		                    		"(i.e., transferring the student pass sticker from your old passport to the new passport). \r\n" + 
		                    		"Please submit both passport (Old & new) for transfer the sticker endorsement. Details refer to http://isc.utm.my/cancellation-of-pass/");
		                }
	                    else if(uText.contains("I had renew my passport at home country. The student pass still valid at old passport. Can I enter Malaysia?")){
		                    botSay("Upon arrival at Malaysia, please show to the Immigration Officer your student pass at old passport. The immigration will give a Special \r\n" + 
		                    		"Pass for 30 days. Please submit your passport for transfer endorsement to new passport at UTM International Office within 3 days of arrival.\r\n" + 
		                    		"");
		                }
	                    else if(uText.contains("What if immegration reject my renewal")){
		                    botSay("If your application for renewal of student pass is rejected by EMGS/ Immigration Department of Malaysia, you are required to defer your \r\n" + 
		                    		"studies  and return to your home country. You will be required to apply for a new student pass.");
		                }
	                    else if(uText.contains("Do I need to submit my passport when apply for renewal?")){
		                    botSay("NO. You are required to submit your original passport only when EMGS  tracker show progress of 90% (usually take 2-3 weeks\r\n" + 
		                    		" after submission of document to UTM). Track your renewal progress at https://educationmalaysia.gov.my/");
		                }
	                    else if(uText.contains("May I know admission recruitment for UTM?")){
		                    botSay("yes sure. where are u from?");
		                }
	                    else if(uText.contains("Can I bring my Spouse, children to apply Dependent Pass during my registration?")){
		                    botSay(" NO. Student MUST travel to Malaysia as Single traveler. You can apply Dependent Pass after student pass is issue to the student (Principle) ");
		                }
	                    else if(uText.contains("I want to bring my family. What should I do?")){
		                    botSay("You can apply Dependent Pass only per as following:\r\n" + 
		                    		"i) Wife/husband with children or\r\n" + 
		                    		"ii) Mother or father or\r\n" + 
		                    		"iii) Husband & mother\r\n" + 
		                    		"Family in law or brother /sister is not allowed to apply for dependent pass ");
		                }
	                    else if(uText.contains("I want to apply Dependent pass for my Mother In Law.")){
		                    botSay(" No. you are not allowed to apply Dependent Pass for In Laws Family according to the rules of Malaysia Immigration Department. However, \r\n" + 
		                    		"f your wife is student, your Mother In Law may apply Dependent Pass under your wife.");
		                }
	                    else if(uText.contains("Do I need to apply VAL for my dependent?")){
		                    botSay(" For certain countries, Immigration Malaysia required student to apply for VAL for Dependent before travel to Malaysia \r\n" + 
		                    		"(update: Currently only Nigeria & Afghanistan required VAL for Dependent. List of country will update from time to time");
		                }
	                    else if(uText.contains("What is the process change University?")){
		                    botSay("If you wish to change your institution ( i.e. degree program at UTM) you will be required to leave the country and make a new application.\r\n" + 
		                    		"  ");
		                }
	                    else if(uText.contains("Can I apply for a student pass directly?")){
		                    botSay("Depending on your Institution type, you will have two options to do this:\r\n" + 
		                    		"\r\n" + 
		                    		"    i. Apply for your Visa online.\r\n" + 
		                    		"\r\n" + 
		                    		"    Students who have received offer letters from Public Universities and Private Higher Education Institutions (IPTS) only will have the option to apply for their student Visa directly through the Education Malaysia website.\r\n" + 
		                    		"\r\n" + 
		                    		"    ii. Apply for your visa through your Institution.\r\n" + 
		                    		"\r\n" + 
		                    		"    The application can also be done through the institution. Once you submit the payment and all required documents to the institution, they will begin the process of applying for your Visa Approval Letter (VAL).\r\n" + 
		                    		"\r\n" + 
		                    		"    Student applying for language centres and skill centres will have to submit application via the institution. ");
		                }
	                    else if(uText.contains("What are the entry requirements to study in Malaysia?")){
		                    botSay(" International students must have at least twelve (12) years of education and have undergone a national/international examination\r\n" + 
		                    		" recognized by the Ministry of Education for the purpose of admission to diploma or degree programmes.");
		                }
	                    else if(uText.contains("Do I need to pass the IELTS or TOEFL examinations in order to study in Malaysia?")){
		                    botSay(" This requirement varies, depending on the course(s)/programmes(s) that you are interested in.\r\n" + 
		                    		" Please clarify the course/programme specific entry requirements with the educational institution directly.");
		                }
	                    else if(uText.contains("When should I apply for my student pass?")){
		                    botSay(" Generally, education institutions have different intake dates for various courses/programmes. \r\n" + 
		                    		"Kindly refer to your institution for information pertaining to intake dates, recommended\r\n" + 
		                    		" application submission dates, fees as well as document requirements.");
		                }
	                    else if(uText.contains("Can I open a bank account?")){
		                    botSay(" Yes, once you get your student pass you can open a bank account.");
		                }
	                    else if(uText.contains("Where will stay in malaysia?")){
		                    botSay(" This solely depends upon your personal choices, although most Malaysian educational institutions offer quality accommodation \r\n" + 
		                    		"services at affordable rates.");
		                }
	                    else if(uText.contains("If my student pass application is rejected, can I get a refund?")){
		                    botSay(" No, the student pass application processing fee is non-refundable.");
		                }
	                    else if(uText.contains("Can I work while on a student pass?")){
		                    botSay(" All international students studying at public or private higher education institutions are allowed to work part-time for a maximum of\r\n" + 
		                    		" 20 hours per week ONLY during semester breaks or holidays of more than 7 days at restaurants, petrol kiosks, mini markets and hotels\r\n" + 
		                    		" as long as their student passes remain valid. Please note that prior approval from the Department of\r\n" + 
		                    		" Immigration is required.");
		                }
	                    else if(uText.contains("Can I pursue two degrees at the same time?")){
		                    botSay("No, you are only allowed to study one full-time degree at any one time. ");
		                }
	                    else if(uText.contains("Can I get a scholarship?")){
		                    botSay(" You will need to check with the college/university that has accepted you as a student on this matter. The Malaysian government \r\n" + 
		                    		"also offers scholarship opportunities to talented students. For further information on these scholarships, you can refer\r\n" + 
		                    		" to this link: https://biasiswa.mohe.gov.my/INTER/");
		                }
	                    else if(uText.contains("What are the tuition fees for international students?")){
		                    botSay(" Tuition fees will depend on the programme and the institution that you choose. Please use our\r\n" + 
		                    		" cost calculator to estimate the costs.");
		                }
	                    else if(uText.contains("What are the living expenses for international students?")){
		                    botSay("Cost of living in Malaysia will depend on your location and lifestyle choices. ");
		                }
	                    else if(uText.contains("If I cancel my application, Will I get a refund?")){
		                    botSay(" Refunds are only processed under certain conditions. Please refer to our Refund policy for more details.");
		                }
	                    else if(uText.contains("I have lost my iKad, what should I do?")){
		                    botSay(" Please submit a police report immediately. You will then be required to submit a copy of the police report to your\r\n" + 
		                    		" institution and inform them to apply for a new iKad. Please note that there will be a fee charged for\r\n" + 
		                    		" the issuance of a new iKad.");
		                }
	                    else if(uText.contains("How can I check whether my passport status?")){
		                    botSay(" You can track your application status on our website to check whether EMGS has received your passport. You can\r\n" + 
		                    		" also download the EMGS mobile app to your mobile phone in order to get automatic notifications.");
		                }
	                    else if(uText.contains("Do I need an entry visa to Malaysia?")){
		                    botSay(" A visa is required to gain entry into Malaysia. Some countries are exempted from this requirement. Please check with\r\n" + 
		                    		" the nearest Malaysian Embassy/Mission.");
		                }else if(uText.contains("How long will it take to get a VAL?")){
		                    botSay(" It should take 14 working days upon receipt of a complete application and payment. Since the Visa Approval Letter (VAL) is \r\n" + 
		                    		"issued by the Immigration Department, the 14 working days is at the discretion of the Immigration Department.");
		                }
		                else if(uText.contains("How to get an entry visa into Malaysia?")){
		                    botSay(" To obtain an entry visa, you are required to visit the nearest Malaysian Embassy in your home country along with\r\n" + 
		                    		"\r\n" + 
		                    		"    your offer letter from the Malaysian education institution\r\n" + 
		                    		"    the Visa Approval Letter issued by the Immigration Department of Malaysia\r\n" + 
		                    		"    all other relevant documents and forms duly completed\r\n" + 
		                    		"    payment as outlined by the Malaysian Embassy for the application of an entry visa.");
		                }
		                else if(uText.contains("What is a student pass?")){
		                    botSay(" A student pass is a multiple entry visa which gives you permission to remain in Malaysia for the purposes of\r\n" + 
		                    		" study at an approved institution on an approved course.");
		                }
		                else if(uText.contains("What is the validity of a student pass?")){
		                    botSay(" For students who are making new applications to Public & Private Higher Education institutions -, students have the option to apply for a Student Pass that covers the entire duration of their course\r\n" + 
		                    		" (subject to sufficient passport validity). For Renewal applications, the student pass will be issued on an \r\n" + 
		                    		"annual basis. When making an application, it is recommended that the passport validity should \r\n" + 
		                    		"be [duration sought + 12 months].\r\n" + 
		                    		"\r\n" + 
		                    		"For students enrolling in Language Schools and Skills Training Centres, the Department of Immigration issues Student Passes for a \r\n" + 
		                    		"maximum of 12 months or, if the course duration is less than 12 months the Pass will be for the duration of the course.\r\n" + 
		                    		"'");
		                }
		                else if(uText.contains("Do I need to submit a security bond deposit in order to obtain a student pass?")){
		                    botSay(" Yes, you will be required to submit a security bond deposit known as a �personal bond�. Please note that this amount\r\n" + 
		                    		" is set by the Government and varies depending on your country of origin. This fee is paid to your educational institution as \r\n" + 
		                    		"a form of security. EMGS does not collect this amount, however, we do require a form from your institution showing that \r\n" + 
		                    		"the amount has been paid to them. Please contact your college/university for further details.");
		                }
		                else if(uText.contains("What happens if I overstay?")){
		                    botSay(" You are required to communicate with your institution to clear your overstay at the Malaysian Immigration Department. Penalty fees may apply, and these \r\n" + 
		                    		"fees are at the discretion of the Immigration Department. Subsequently, you will need to apply for\r\n" + 
		                    		" a special pass to ensure that you have a valid pass throughout your stay in Malaysia.");
		                }
		               
	                
	                
	                else{
	                    int decider = (int) (Math.random()*3+1);
	                    if(decider == 1){
	                        botSay("I didn't get that");
	                    }
	                    else if(decider == 2){
	                        botSay("Please rephrase that");
	                    }
	                    else if(decider == 3){
	                        botSay("What the hell are you talking about?");
	                    }
	                 
	                }
	                txtEnter.setText("");
	            }
	        });
	    
	        //txtChat Attributes:
	        txtChat.setLocation(15, 5);
	        txtChat.setSize(560, 510);
	        txtChat.setEditable(false);
	       
	        //Add Items To Frame:
	        this.add(txtEnter);
	        this.add(txtChat);
	    }
	   
	    public void botSay(String s){
	        txtChat.append("  --> UTM SMART:   " + s + "\n");
	    }
	    
	    public static void main(String[] args) {
	        // TODO code application logic here
	        new UTMChatbot();
	    }
	    
	}


