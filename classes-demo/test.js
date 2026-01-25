 {
        name: customTranslate("Depreciation"),
        icon: Calendar1,
        accentColor: "text-teal-500",
        dataKey: "depreciation",
        childern: [
            {
                name: customTranslate("Depreciation Dashboard"),
                url: "/depreciation/depdashboard",
                dataKey: "depreciation.dashboard",
            },
            {
                name: customTranslate("Company Act Report"),
                url: "/depreciation/companyactreport",
                dataKey: "depreciation.companyActReport",
            },
            {
                name: customTranslate("Change Life of asset"),
                url: "/depreciation/changeLifeOfAsset",
                dataKey: "depreciation.changeLifeOfasset",
            },
            {
                name: customTranslate("Depreciation Report"),
                url: "/depreciation/depreport",
                dataKey: "depreciation.depreciation",
            },
            {
                name: customTranslate("Addition/Deletion Report"),
                url: "/depreciation/additionDeletionReport",
                dataKey: "depreciation.additionDeletionReport",
            },
            {
                name: customTranslate("IT ACT Rate Update"),
                url: "/depreciation/itactrate",
                dataKey: "depreciation.itActRateUpdate",
            },
            {
                name: customTranslate("IT Act Report"),
                url: "/depreciation/itactreport",
                dataKey: "depreciation.itActReport",
            },
        ],
        expanded: false,
    },