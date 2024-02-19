<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>td_(SELECT REQUESTER NAME DISPLAY_NAME FROM_c3491b</name>
   <tag></tag>
   <elementGuidId>1b7e9ac1-d1ae-41cd-b5a5-4ae6cdf61e5e</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//td[@id='OBJ_API_ig_grid_vc_cur']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#OBJ_API_ig_grid_vc_cur</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>td</value>
      <webElementGuid>94d6ab92-6999-440a-bfa1-06968dadd6ed</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>role</name>
      <type>Main</type>
      <value>gridcell</value>
      <webElementGuid>96d60738-22bf-4077-a1ae-ff545c0f1d04</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tabindex</name>
      <type>Main</type>
      <value>0</value>
      <webElementGuid>c516bd39-2e8e-426a-b91a-f25b305469c8</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>a-GV-cell u-tS is-focused</value>
      <webElementGuid>d2c27090-95e8-4f1b-8a00-0043a7a1956f</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-labelledby</name>
      <type>Main</type>
      <value>OBJ_API_ig_grid_vc_ctx C166800110085777420_HDR OBJ_API_ig_grid_vc_cur</value>
      <webElementGuid>c39962ac-36b7-4a33-9980-1af4be5cc15e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>OBJ_API_ig_grid_vc_cur</value>
      <webElementGuid>d9e41da4-92b6-402b-991d-25c097d2d8ae</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>(SELECT 'REQUESTER NAME: '||DISPLAY_NAME FROM FSOD.FSOD_USER_ALL WHERE USER_ID = A.VERIFIED_BY) || 
(SELECT '\NPERSON NAME: ' || DESCRIPTION || '\NEID: ' || USER_NAME FROM FSOD.FSOD_UAC_USER_ROLES WHERE ROWID = A.ROWID) ||
(SELECT '\NADID: ' || ORIG_ID || '\NREQUEST TYPE: REMOVE \NUSER TYPE: ' || TYPE FROM FSOD.FSOD_USER_ALL WHERE USER_ID = A.USER_ID) ||
(SELECT '\NMARKET/LOCATION: ' || ATR.DISPLAY_NAME FROM FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL EAA, FSOD.FSOD_ATTRIBUTE_ALL ATR,
FSOD.FSOD_ATTRIBUTE_TYPE TYP WHERE EAA.ENTRY_ID = A.ROLE_ID AND EAA.USER_ID = A.USER_ID AND EAA.ATTRIBUTE_ID = ATR.ATTRIBUTE_ID
AND ATR.ATTRIBUTE_TYPE_ID = TYP.ATTRIBUTE_TYPE_ID AND EAA.GROUP_ID = ATR.GROUP_ID AND ATR.GROUP_ID = A.GROUP_ID AND UPPER(TYP.NAME) = 'MARKET' ) ||
(SELECT '\NROLE: ' || ROLE_NAME FROM FSOD.FSOD_UAC_USER_ROLES WHERE ROWID = A.ROWID) ||
(SELECT ' \N ACCESS END DATE: '||TO_CHAR(END_DATE,'MM-DD-YYYY') FROM FSOD.FSOD_UAC_TESTS WHERE UAC_ID = A.UAC_ID)</value>
      <webElementGuid>58e4ca8d-78ec-4983-8857-c20bdbb1fa8e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;OBJ_API_ig_grid_vc_cur&quot;)</value>
      <webElementGuid>3ef1edf9-3a95-41d6-b74d-922ae53fc265</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//td[@id='OBJ_API_ig_grid_vc_cur']</value>
      <webElementGuid>af3e143c-0eac-4ea9-b9c3-5a9ecb6222e5</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='OBJ_API_ig_grid_vc']/div[3]/div[4]/table/tbody/tr[10]/td[5]</value>
      <webElementGuid>b06c2d22-fe44-4115-a829-9f406dd3e92e</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='description'])[2]/following::td[1]</value>
      <webElementGuid>b97cf42e-2ead-4dc7-9d29-019b67a8073c</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='FSOD.FSOD_UAC_USER_ROLES (TABLE)'])[10]/following::td[3]</value>
      <webElementGuid>a4521637-5e71-4797-a2be-b0db6c6cd47e</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='-'])[45]/preceding::td[1]</value>
      <webElementGuid>7cc24a20-9feb-42f8-bcb1-57d3dabd07de</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Page rows'])[3]/preceding::td[2]</value>
      <webElementGuid>152e5c18-98d3-4cc6-8191-a0fda3ab1b4c</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[3]/div/div/div[2]/div[2]/div/div[5]/div[3]/div/div[3]/div[4]/table/tbody/tr[10]/td[5]</value>
      <webElementGuid>e9b25645-4d36-4721-9db9-414f6e48c298</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//td[@id = 'OBJ_API_ig_grid_vc_cur' and (text() = concat(&quot;(SELECT &quot; , &quot;'&quot; , &quot;REQUESTER NAME: &quot; , &quot;'&quot; , &quot;||DISPLAY_NAME FROM FSOD.FSOD_USER_ALL WHERE USER_ID = A.VERIFIED_BY) || 
(SELECT &quot; , &quot;'&quot; , &quot;\NPERSON NAME: &quot; , &quot;'&quot; , &quot; || DESCRIPTION || &quot; , &quot;'&quot; , &quot;\NEID: &quot; , &quot;'&quot; , &quot; || USER_NAME FROM FSOD.FSOD_UAC_USER_ROLES WHERE ROWID = A.ROWID) ||
(SELECT &quot; , &quot;'&quot; , &quot;\NADID: &quot; , &quot;'&quot; , &quot; || ORIG_ID || &quot; , &quot;'&quot; , &quot;\NREQUEST TYPE: REMOVE \NUSER TYPE: &quot; , &quot;'&quot; , &quot; || TYPE FROM FSOD.FSOD_USER_ALL WHERE USER_ID = A.USER_ID) ||
(SELECT &quot; , &quot;'&quot; , &quot;\NMARKET/LOCATION: &quot; , &quot;'&quot; , &quot; || ATR.DISPLAY_NAME FROM FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL EAA, FSOD.FSOD_ATTRIBUTE_ALL ATR,
FSOD.FSOD_ATTRIBUTE_TYPE TYP WHERE EAA.ENTRY_ID = A.ROLE_ID AND EAA.USER_ID = A.USER_ID AND EAA.ATTRIBUTE_ID = ATR.ATTRIBUTE_ID
AND ATR.ATTRIBUTE_TYPE_ID = TYP.ATTRIBUTE_TYPE_ID AND EAA.GROUP_ID = ATR.GROUP_ID AND ATR.GROUP_ID = A.GROUP_ID AND UPPER(TYP.NAME) = &quot; , &quot;'&quot; , &quot;MARKET&quot; , &quot;'&quot; , &quot; ) ||
(SELECT &quot; , &quot;'&quot; , &quot;\NROLE: &quot; , &quot;'&quot; , &quot; || ROLE_NAME FROM FSOD.FSOD_UAC_USER_ROLES WHERE ROWID = A.ROWID) ||
(SELECT &quot; , &quot;'&quot; , &quot; \N ACCESS END DATE: &quot; , &quot;'&quot; , &quot;||TO_CHAR(END_DATE,&quot; , &quot;'&quot; , &quot;MM-DD-YYYY&quot; , &quot;'&quot; , &quot;) FROM FSOD.FSOD_UAC_TESTS WHERE UAC_ID = A.UAC_ID)&quot;) or . = concat(&quot;(SELECT &quot; , &quot;'&quot; , &quot;REQUESTER NAME: &quot; , &quot;'&quot; , &quot;||DISPLAY_NAME FROM FSOD.FSOD_USER_ALL WHERE USER_ID = A.VERIFIED_BY) || 
(SELECT &quot; , &quot;'&quot; , &quot;\NPERSON NAME: &quot; , &quot;'&quot; , &quot; || DESCRIPTION || &quot; , &quot;'&quot; , &quot;\NEID: &quot; , &quot;'&quot; , &quot; || USER_NAME FROM FSOD.FSOD_UAC_USER_ROLES WHERE ROWID = A.ROWID) ||
(SELECT &quot; , &quot;'&quot; , &quot;\NADID: &quot; , &quot;'&quot; , &quot; || ORIG_ID || &quot; , &quot;'&quot; , &quot;\NREQUEST TYPE: REMOVE \NUSER TYPE: &quot; , &quot;'&quot; , &quot; || TYPE FROM FSOD.FSOD_USER_ALL WHERE USER_ID = A.USER_ID) ||
(SELECT &quot; , &quot;'&quot; , &quot;\NMARKET/LOCATION: &quot; , &quot;'&quot; , &quot; || ATR.DISPLAY_NAME FROM FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL EAA, FSOD.FSOD_ATTRIBUTE_ALL ATR,
FSOD.FSOD_ATTRIBUTE_TYPE TYP WHERE EAA.ENTRY_ID = A.ROLE_ID AND EAA.USER_ID = A.USER_ID AND EAA.ATTRIBUTE_ID = ATR.ATTRIBUTE_ID
AND ATR.ATTRIBUTE_TYPE_ID = TYP.ATTRIBUTE_TYPE_ID AND EAA.GROUP_ID = ATR.GROUP_ID AND ATR.GROUP_ID = A.GROUP_ID AND UPPER(TYP.NAME) = &quot; , &quot;'&quot; , &quot;MARKET&quot; , &quot;'&quot; , &quot; ) ||
(SELECT &quot; , &quot;'&quot; , &quot;\NROLE: &quot; , &quot;'&quot; , &quot; || ROLE_NAME FROM FSOD.FSOD_UAC_USER_ROLES WHERE ROWID = A.ROWID) ||
(SELECT &quot; , &quot;'&quot; , &quot; \N ACCESS END DATE: &quot; , &quot;'&quot; , &quot;||TO_CHAR(END_DATE,&quot; , &quot;'&quot; , &quot;MM-DD-YYYY&quot; , &quot;'&quot; , &quot;) FROM FSOD.FSOD_UAC_TESTS WHERE UAC_ID = A.UAC_ID)&quot;))]</value>
      <webElementGuid>15f02aac-8cda-4a91-b23d-2cf530950e1f</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
