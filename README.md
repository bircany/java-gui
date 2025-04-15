# java-gui
This Repo is used for components and training purposes of Swing and JavaFX libraries for Java GUI.
Bu doküman, Java'nın iki temel GUI (Graphical User Interface) kütüphanesi olan Swing ve JavaFX arasındaki farkları, benzerlikleri ve karşılık gelen bileşenleri açıklar.

Genel Karşılaştırma
Özellik	Swing	JavaFX
Mimari	AWT üzerine kurulu	GPU hızlandırmalı (Prism)
Tasarım Dili	LookAndFeel (pluggable)	FXML + CSS
Animasyon	Sınırlı (Timer kullanımı)	Zengin animasyon desteği
3D Grafikler	Yok	Var
Medya Desteği	Yok	Video/Audio oynatma
Veri Bağlama	Manuel	Observable ve Property
Platform	JDK ile birlikte	Java 11+ için ayrı modül
Önerilen Kullanım	Eski projeler, basit GUI'ler	Modern, dinamik uygulamalar
Konu Başlıkları ve Karşılık Gelen Bileşenler
1. Temel Pencere Yapısı
Swing	JavaFX	Notlar
JFrame	Stage	Ana pencere yapısı
JPanel	Pane (StackPane, VBox vb.)	Layout konteynerları
JWindow	Popup veya Stage	Alt pencereler
2. Kontroller (Widgets)
Swing	JavaFX	Notlar
JButton	Button	Düğme kontrolü
JLabel	Label	Metin görüntüleme
JTextField	TextField	Tek satırlık metin girişi
JTextArea	TextArea	Çok satırlı metin girişi
JCheckBox	CheckBox	Onay kutusu
JRadioButton	RadioButton + ToggleGroup	Seçim butonları
JComboBox	ComboBox	Açılır liste
JList	ListView	Liste görünümü
JTable	TableView	Tablo yapısı (daha gelişmiş)
JSlider	Slider	Kaydırma çubuğu
JProgressBar	ProgressBar	İlerleme çubuğu
3. Layout Yönetimi
Swing	JavaFX	Notlar
FlowLayout	FlowPane	Akış düzeni
BorderLayout	BorderPane	Kenarlara göre düzen
GridLayout	GridPane	Izgara düzeni
BoxLayout	VBox / HBox	Dikey/Yatay düzen
CardLayout	StackPane	Üst üste yerleşim
4. Olay Yönetimi (Event Handling)
Swing	JavaFX	Notlar
ActionListener	setOnAction	Buton tıklama olayı
MouseListener	setOnMouseClicked	Fare olayları
KeyListener	setOnKeyPressed	Klavye olayları
5. Özelleştirme ve Stil
Swing	JavaFX	Notlar
setForeground()	setStyle() veya CSS	JavaFX CSS ile daha esnek
setBackground()	-fx-background-color	
LookAndFeel	Scene + CSS	JavaFX daha modern
6. İleri Seviye Özellikler
Swing	JavaFX	Notlar
JOptionPane	Alert	Dialog kutuları
JFileChooser	FileChooser	Dosya seçme
JMenuBar	MenuBar	Menü çubuğu
JToolBar	ToolBar	Araç çubuğu
JTabbedPane	TabPane	Sekmeli arayüz
JTree	TreeView	Ağaç yapısı
Yok	WebView	HTML/Web içeriği gösterme
Yok	Canvas + GraphicsContext	Özel çizimler (daha hızlı)
Hangi Durumda Hangisi Kullanılmalı?
Swing Kullanın:
✔ Basit GUI'ler (formlar, dialog pencereleri)
✔ Eski Java projeleri (JDK 8 veya öncesi)
✔ Düşük sistem kaynağı gerektiren uygulamalar

JavaFX Kullanın:
✔ Modern ve animasyonlu arayüzler
✔ CSS ile stil kontrolü
✔ Medya oynatma (video/audio)
✔ 3D grafikler ve oyun geliştirme
✔ Dinamik veri bağlama (Observable/Property)
