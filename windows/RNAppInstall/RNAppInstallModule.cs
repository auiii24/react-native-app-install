using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace App.Install.RNAppInstall
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNAppInstallModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNAppInstallModule"/>.
        /// </summary>
        internal RNAppInstallModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNAppInstall";
            }
        }
    }
}
