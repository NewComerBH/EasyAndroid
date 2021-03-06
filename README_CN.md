[![GitHub release](https://img.shields.io/github/release/Ayvytr/AndroidEasyDeveloper.svg)](https://github.com/Ayvytr/AndroidEasyDeveloper/releases)
[![](https://jitpack.io/v/Ayvytr/AndroidEasyDeveloper.svg)](https://jitpack.io/#Ayvytr/AndroidEasyDeveloper)
<a href="http://www.methodscount.com/?lib=com.github.Ayvytr%3AAndroidEasyDeveloper%3A1.0.0"><img src="https://img.shields.io/badge/Size-20 KB-e91e63.svg"/></a>
<a href="http://www.methodscount.com/?lib=com.github.Ayvytr%3AAndroidEasyDeveloper%3A1.0.0"><img src="https://img.shields.io/badge/Methods count-core: 15 | deps: 19163-e91e63.svg"/></a>
<a href="http://www.methodscount.com/?lib=com.github.Ayvytr%3AAndroidEasyDeveloper%3A1.0.0"><img src="https://img.shields.io/badge/Methods and size-core: 15 | deps: 19163 | 20 KB-e91e63.svg"/></a>


----------

#EasyAndroid 库

#[English][README.md]

##Use
    (有关Context类:   先在 'Application.onCreate()' 中调用 'Easy.getDefault().init(this);')
        
    直接使用

##Build

###Step 1. Add the JitPack repository to your build file

####Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
####Step 2. Add the dependency

	dependencies {
	        compile 'com.github.Ayvytr:AndroidEasyDeveloper:1.1.0'
	}
	

##Contains 

###资源
	从 0-100 dp 和 sp 资源
	有关TextView等View的Style


###自定义View (有关TextView的类可能作用不大)

	CenterGravityTextView
	LeftCenterGravityTextView
	RightCenterGravityTextView

	SeekBarPressure: 双Thumb的SeekBar

###Tool classes with out Context
	Convert		类型转换类，仿照了C#的Convert类（对这个类情(zhen)有(de)独(hao)钟(yong)）
				提供了大部分基本类型到bool，int，byte的转换，以及isZero方法
		toBool
		izZero
		toInt
		toByte

	EncodeTool 	编码解码相关操作类
		urlEncode
		urlDecode
		base64Encode
		base64Decode
		base64UrlSafeEncode
		htmlEncode
		htmlDecode

	EncryptTool	加密解密相关操作类
		encryptMD2ToString
		encryptMD2
		encryptMD5ToString
		encryptMD5
		encryptSHA1ToString
		encryptSHA1
		encryptSHA224ToString
		encryptSHA224
		encryptSHA256ToString
		encryptSHA256
		encryptSHA384ToString
		encryptSHA384
		encryptSHA512ToString
		encryptSHA512
		hashTemplate
		encryptHmacMD5ToString
		encryptHmacMD5
		encryptHmacSHA1ToString
		encryptHmacSHA1
		encryptHmacSHA224ToString
		encryptHmacSHA224
		encryptHmacSHA256ToString
		encryptHmacSHA256
		encryptHmacSHA384ToString
		encryptHmacSHA384
		encryptHmacSHA512ToString
		encryptHmacSHA512
		hmacTemplate
		encryptDES2Base64
		encryptDES2HexString
		encryptDES
		decryptBase64DES
		decryptHexStringDES
		decryptDES
		encrypt3DES2Base64
		encrypt3DES2HexString
		encrypt3DES
		decryptBase64_3DES
		decryptHexString3DES
		decrypt3DES
		encryptAES2Base64
		encryptAES2HexString
		encryptAES
		decryptBase64AES
		decryptHexStringAES
		decryptAES
		desTemplate
		bytes2HexString
		hexString2Bytes
		hex2Dec
		base64Encode
		base64Decode

	FileTool	文件操作类，判断是不是文件/目录，是不是存在，重命名，创建文件/目录，列出/搜索文件，
				获取文件名/文件标题（不包含扩展名), 有没有扩展名，读/写文件等方法
		fromName
		isExists
		rename
		isDir
		isFile
		createDir
		createFile
		listFilesInDir
		listFilesInDirWithFilter
		searchFileInDir
		writeFile
		write
		readFile
		read
		getByteArray
		getLastModified
		getName
		getTitle
		getExtension
		hasExtension
		isTyped

	RegexTool	正则工具类，包括验证手机号，邮箱，身份证号码等
		isMobileSimple
		isMobileExact
		isTel
		isIDCard15
		isIDCard18
		isEmail
		isURL
		isZh
		isUsername
		isDate
		isIP
		isMatch
		getMatches
		getSplits
		getReplaceFirst
		getReplaceAll

	TextTool	提供了众多的字符串操作功能，包括判空，是不是字符串，分割字符串（会去掉末尾的regex）等功能
		isEmpty
		isDigit
		isNumber
		reverse
		emptyString
		split
		isBlank

###Tool classes with Context
	Easy	这个库的单例入口类, 使用有关Context的类之前，需要初始化这个类
		getContext
		checkInitState
		getDefault
		init
		release
		getClipboardManager
		getWindowManager
		getKeyguardManager

	BarTool	StatusBar, ActionBar操作工具类		
		setColor
		setColorForSwipeBack
		setColorNoTranslucent
		setColorDiff
		setTranslucent
		setTranslucentForCoordinatorLayout
		setTransparent
		setTranslucentDiff
		setColorForDrawerLayout
		setColorNoTranslucentForDrawerLayout
		setColorForDrawerLayout
		setColorForDrawerLayoutDiff
		setTranslucentForDrawerLayout
		setTranslucentForDrawerLayoutDiff
		setTransparentForImageView
		setTranslucentForImageViewInFragment
		clearPreviousSetting
		addTranslucentView
		createStatusBarView
		setRootView
		setTransparentForWindow
		transparentStatusBar
		createTranslucentStatusBarView
		getStatusBarHeight
		calculateStatusColor
		setTransparentStatusBar
		hideStatusBar
		isStatusBarExists
		getActionBarHeight
		showNotificationBar
		hideNotificationBar
		invokePanels

	ClipboardTool	剪贴板操作类
		setText
		getText
		getText
		setUri
		getUri
		setIntent
		getIntent

	DensityTool	Dp - Px 相互转化类，提供了int，float，double 3种类型的重载方法，尽可能减少外部强制类型转换.
		px2dp
		dp2px

	IntentTool	获取常用的Intent
		getInstallAppIntent
		getUninstallAppIntent
		getLaunchAppIntent
		getAppDetailsSettingsIntent
		getShareTextIntent
		getShareImageIntent
		getComponentIntent
		getShutdownIntent
		getDialIntent
		getCallIntent
		getSendSmsIntent
		getCaptureIntent

	ResTool		获取资源中Drawable，String，dimension，color, Configuration.
		getDrawable
		getString
		getDimen
		getDimenFloat
		getDimenToDp
		getDimenFloatToDp
		getColor
		getConfiguration

	ScreenTool	提供了获取屏幕尺寸，宽高，屏幕旋转方向，设置为竖屏，是不是横屏/竖屏，获取屏幕截图（包含/不包含状态栏)， 判断是不是锁屏的功能.
		getDisplayMetrics
		getScreenWidth
		getScreenHeight
		setLandscape
		setPortrait
		isLandscape
		isPortrait
		getScreenRotationAngle
		getRotationAngle
		captureWithStatusBar
		captureWithoutStatusBar
		isScreenLock

	ToastTool 	Toast工具类，提供简便的Toast创建和输出功能
    	make
		makeLong
		show
		showLong
		    



###引用如下，感谢他们的库
1. https://github.com/Blankj/AndroidUtilCode
2. https://github.com/Trinea/android-common
3. https://github.com/wyouflf/xUtils3
4. https://github.com/jingle1267/android-utils

###TODO:
1. 完善Convert类
2. 开发我自己的视频播放器 PrettyVideoPlayer
3. 完善这个库，添加更多实用的功能
4. 个人网站
5. 分离Android和Java代码，打包成不同的库
6. 发布到JCenter