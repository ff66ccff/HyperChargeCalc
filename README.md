# HyperChargeCalc

![Platform](https://img.shields.io/badge/Platform-Android-green.svg) ![License](https://img.shields.io/github/license/ff66ccff/HyperChargeCalc)

一个简洁、离线的安卓应用，用于计算您小米 HyperOS/MIUI 设备的电池健康度。

本项目是对 **[HikiMu慕慕](https://github.com/Hikimucheno)** 所创造的优秀[在线计算工具](http://119.29.227.6/blog/content/Survey_on_Remaining_Battery_Capacity_of_Xiaomi_Mobile&Tablet/onlineweb.html)的致敬与本地化实现。

## ✨ 主要特性 (Key Features)

*   **🚀 完全离线 (Fully Offline)**: 无需网络连接。所有计算都在您的设备本地完成，确保了数据的绝对隐私与安全。
*   **✨ 现代化UI (Modern UI)**: 使用了简洁、美观的界面设计，并包含日间与夜间两种模式，以适应不同环境下的使用。
*   **🔒 注重隐私 (Privacy-Focused)**: 应用不会收集或上传任何您的文件或设备信息。
*   **🎯 操作简单 (Simple to Use)**: 只需三步即可获取电池健康度报告。



## ⚙️ 使用方法 (How to Use)

1.  **生成Bugreport文件**:
    *   前往手机的 `设置` > `我的设备` > `全部参数与信息`。
    *   连续点击 `处理器` 选项7次，直到系统提示正在生成错误报告 (Bugreport)。
    *   等待片刻，通知栏会提示您 `Bug report #X captured`。

2.  **选择文件并计算**:
    *   打开 **HyperChargeCalc** 应用。
    *   点击“选择Bugreport ZIP文件”，并在手机文件管理器中找到刚刚生成的那个ZIP压缩包。
    *   输入您设备的“设计电池容量”（通常可以在手机的官方规格参数中找到）。
    *   点击“开始计算”，即可看到结果。

## 📲 安装 (Installation)

1.  前往本项目的 **[Releases](https://github.com/ff66ccff/HyperChargeCalc/releases)** 页面。
2.  下载最新版本的 `.apk` 安装文件。
3.  在您的手机上打开该文件并完成安装。（如果系统提示，请允许“来自未知来源的应用安装”）

## 🙏 致谢 (Acknowledgments)

本应用的核心功能与解析逻辑完全源于 **[HikiMu慕慕 (Hikimucheno)](https://github.com/Hikimucheno)** 的开创性工作。没有他的探索，这个应用便无从谈起。再次向原作者表示最诚挚的感谢！

## ⚠️ 免责声明 (Disclaimer)

*   本工具的计算结果仅通过解析系统诊断文件估算得出，仅供参考，不具备官方检测的法律效力。
*   如您的设备出现任何异常，请务必联系小米官方售后服务中心。

## 📄 许可 (License)

本项目采用 [MIT](https://github.com/ff66ccff/HyperChargeCalc/blob/main/LICENSE) 许可。