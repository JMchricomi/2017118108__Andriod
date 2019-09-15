一、打开在sourcetree克隆的郭霖的第一行代码里面的“chapter1”的“HelloWorld"
	打开后在"app"目录下是无法找到"manifests"，所以要更改下载一些东西。
	
二、打开"HelloWorld"项目后在目录"Gradle Scripts"里面选择"build.gradle"
	将代码"dependencies"里面的编号改为当前自己电脑的AndriodStudio的版本号；
	如我的是改成了"3.5.0"：
	dependencies {
        classpath 'com.android.tools.build:gradle:3.5.0'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
	并且将"allprojects"里面加多一个"google()"
	如下：
	allprojects {
		repositories {
			jcenter()
			google()
		}
	}
	
三、选择目录"Gradle Scripts"里面的"gradle-wrapper.properties"，
	将"distributionUrl"的数字编号也改成自己电脑里面的（这个在自己电脑
	新建一个项目然后在同样的目录打开会写对应的是什么版本编号）
	如我的是改成了"5.4.1"：
	distributionUrl=https\://services.gradle.org/distributions/gradle-5.4.1-all.zip
	
四、最后在屏幕下方的Build里面的右边会出现"Add Google Haven repository and sync project",
	点击添加下载好需要的东西再同步就可以运行这个"HelloWorld"项目了。