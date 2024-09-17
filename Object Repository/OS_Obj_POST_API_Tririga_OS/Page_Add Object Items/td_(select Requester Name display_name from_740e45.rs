<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>td_(select Requester Name display_name from_740e45</name>
   <tag></tag>
   <elementGuidId>7d3b51e3-21de-4043-863b-61f1cb9ff99f</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#oItemsApiIg_ig_grid_vc_cur</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//td[(text() = concat(&quot;(select &quot; , &quot;'&quot; , &quot;Requester Name: &quot; , &quot;'&quot; , &quot;||display_name from fsod.fsod_user_all where user_id = a.verified_by) || 
 (select &quot; , &quot;'&quot; , &quot;\nPerson Name: &quot; , &quot;'&quot; , &quot; || description || &quot; , &quot;'&quot; , &quot;\nEID: &quot; , &quot;'&quot; , &quot; || user_name from fsod.fsod_uac_user_roles where rowid = a.rowid) ||
 (select &quot; , &quot;'&quot; , &quot;\nADID: &quot; , &quot;'&quot; , &quot; || orig_id || &quot; , &quot;'&quot; , &quot;\nRequest Type: Remove \nUser Type: &quot; , &quot;'&quot; , &quot; || type from fsod.fsod_user_all where user_id = a.user_id) ||
 (select &quot; , &quot;'&quot; , &quot;\nMarket/Location: &quot; , &quot;'&quot; , &quot; || atr.display_name from fsod.fsod_user_entry_attribute_all eaa, fsod.fsod_attribute_all atr, fsod.fsod_attribute_type typ where eaa.entry_id = a.role_id and eaa.user_id = a.user_id and eaa.attribute_id = atr.attribute_id and atr.attribute_type_id = typ.attribute_type_id and eaa.group_id = atr.group_id and atr.group_id = a.group_id and upper(typ.name) = &quot; , &quot;'&quot; , &quot;MARKET&quot; , &quot;'&quot; , &quot; ) ||
 (select &quot; , &quot;'&quot; , &quot;\nRole: &quot; , &quot;'&quot; , &quot; || role_name from fsod.fsod_uac_user_roles where rowid = a.rowid) ||
 (select &quot; , &quot;'&quot; , &quot; \n Access end date: &quot; , &quot;'&quot; , &quot;||to_char(end_date,&quot; , &quot;'&quot; , &quot;MM-DD-YYYY&quot; , &quot;'&quot; , &quot;) from fsod.fsod_uac_tests where uac_id = a.uac_id)&quot;) or . = concat(&quot;(select &quot; , &quot;'&quot; , &quot;Requester Name: &quot; , &quot;'&quot; , &quot;||display_name from fsod.fsod_user_all where user_id = a.verified_by) || 
 (select &quot; , &quot;'&quot; , &quot;\nPerson Name: &quot; , &quot;'&quot; , &quot; || description || &quot; , &quot;'&quot; , &quot;\nEID: &quot; , &quot;'&quot; , &quot; || user_name from fsod.fsod_uac_user_roles where rowid = a.rowid) ||
 (select &quot; , &quot;'&quot; , &quot;\nADID: &quot; , &quot;'&quot; , &quot; || orig_id || &quot; , &quot;'&quot; , &quot;\nRequest Type: Remove \nUser Type: &quot; , &quot;'&quot; , &quot; || type from fsod.fsod_user_all where user_id = a.user_id) ||
 (select &quot; , &quot;'&quot; , &quot;\nMarket/Location: &quot; , &quot;'&quot; , &quot; || atr.display_name from fsod.fsod_user_entry_attribute_all eaa, fsod.fsod_attribute_all atr, fsod.fsod_attribute_type typ where eaa.entry_id = a.role_id and eaa.user_id = a.user_id and eaa.attribute_id = atr.attribute_id and atr.attribute_type_id = typ.attribute_type_id and eaa.group_id = atr.group_id and atr.group_id = a.group_id and upper(typ.name) = &quot; , &quot;'&quot; , &quot;MARKET&quot; , &quot;'&quot; , &quot; ) ||
 (select &quot; , &quot;'&quot; , &quot;\nRole: &quot; , &quot;'&quot; , &quot; || role_name from fsod.fsod_uac_user_roles where rowid = a.rowid) ||
 (select &quot; , &quot;'&quot; , &quot; \n Access end date: &quot; , &quot;'&quot; , &quot;||to_char(end_date,&quot; , &quot;'&quot; , &quot;MM-DD-YYYY&quot; , &quot;'&quot; , &quot;) from fsod.fsod_uac_tests where uac_id = a.uac_id)&quot;))]</value>
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
      <webElementGuid>5a2ce2ca-164b-4d13-b082-bd999010a617</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>role</name>
      <type>Main</type>
      <value>gridcell</value>
      <webElementGuid>f81299ef-7c30-4eb6-8784-4d439e71947b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tabindex</name>
      <type>Main</type>
      <value>0</value>
      <webElementGuid>15124ed6-b197-45ae-9b03-2872f8354f4b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>a-GV-cell u-tS is-focused</value>
      <webElementGuid>e59aaf80-8167-4bba-80c5-5454835a8513</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-labelledby</name>
      <type>Main</type>
      <value>oItemsApiIg_ig_grid_vc_ctx oItemsApiIg_ig_grid_vc_cur</value>
      <webElementGuid>6dd77d4f-112e-47d3-9947-d7ad39c596c0</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>oItemsApiIg_ig_grid_vc_cur</value>
      <webElementGuid>e8364772-2b8a-4d4e-8006-eb031fe139ed</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>(select 'Requester Name: '||display_name from fsod.fsod_user_all where user_id = a.verified_by) || 
 (select '\nPerson Name: ' || description || '\nEID: ' || user_name from fsod.fsod_uac_user_roles where rowid = a.rowid) ||
 (select '\nADID: ' || orig_id || '\nRequest Type: Remove \nUser Type: ' || type from fsod.fsod_user_all where user_id = a.user_id) ||
 (select '\nMarket/Location: ' || atr.display_name from fsod.fsod_user_entry_attribute_all eaa, fsod.fsod_attribute_all atr, fsod.fsod_attribute_type typ where eaa.entry_id = a.role_id and eaa.user_id = a.user_id and eaa.attribute_id = atr.attribute_id and atr.attribute_type_id = typ.attribute_type_id and eaa.group_id = atr.group_id and atr.group_id = a.group_id and upper(typ.name) = 'MARKET' ) ||
 (select '\nRole: ' || role_name from fsod.fsod_uac_user_roles where rowid = a.rowid) ||
 (select ' \n Access end date: '||to_char(end_date,'MM-DD-YYYY') from fsod.fsod_uac_tests where uac_id = a.uac_id)</value>
      <webElementGuid>19bd6eed-d896-44e0-9555-26dd98dcae12</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;oItemsApiIg_ig_grid_vc_cur&quot;)</value>
      <webElementGuid>1e9f22b5-d4eb-4cbb-bb91-eb3f71253e4c</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//td[(text() = concat(&quot;(select &quot; , &quot;'&quot; , &quot;Requester Name: &quot; , &quot;'&quot; , &quot;||display_name from fsod.fsod_user_all where user_id = a.verified_by) || 
 (select &quot; , &quot;'&quot; , &quot;\nPerson Name: &quot; , &quot;'&quot; , &quot; || description || &quot; , &quot;'&quot; , &quot;\nEID: &quot; , &quot;'&quot; , &quot; || user_name from fsod.fsod_uac_user_roles where rowid = a.rowid) ||
 (select &quot; , &quot;'&quot; , &quot;\nADID: &quot; , &quot;'&quot; , &quot; || orig_id || &quot; , &quot;'&quot; , &quot;\nRequest Type: Remove \nUser Type: &quot; , &quot;'&quot; , &quot; || type from fsod.fsod_user_all where user_id = a.user_id) ||
 (select &quot; , &quot;'&quot; , &quot;\nMarket/Location: &quot; , &quot;'&quot; , &quot; || atr.display_name from fsod.fsod_user_entry_attribute_all eaa, fsod.fsod_attribute_all atr, fsod.fsod_attribute_type typ where eaa.entry_id = a.role_id and eaa.user_id = a.user_id and eaa.attribute_id = atr.attribute_id and atr.attribute_type_id = typ.attribute_type_id and eaa.group_id = atr.group_id and atr.group_id = a.group_id and upper(typ.name) = &quot; , &quot;'&quot; , &quot;MARKET&quot; , &quot;'&quot; , &quot; ) ||
 (select &quot; , &quot;'&quot; , &quot;\nRole: &quot; , &quot;'&quot; , &quot; || role_name from fsod.fsod_uac_user_roles where rowid = a.rowid) ||
 (select &quot; , &quot;'&quot; , &quot; \n Access end date: &quot; , &quot;'&quot; , &quot;||to_char(end_date,&quot; , &quot;'&quot; , &quot;MM-DD-YYYY&quot; , &quot;'&quot; , &quot;) from fsod.fsod_uac_tests where uac_id = a.uac_id)&quot;) or . = concat(&quot;(select &quot; , &quot;'&quot; , &quot;Requester Name: &quot; , &quot;'&quot; , &quot;||display_name from fsod.fsod_user_all where user_id = a.verified_by) || 
 (select &quot; , &quot;'&quot; , &quot;\nPerson Name: &quot; , &quot;'&quot; , &quot; || description || &quot; , &quot;'&quot; , &quot;\nEID: &quot; , &quot;'&quot; , &quot; || user_name from fsod.fsod_uac_user_roles where rowid = a.rowid) ||
 (select &quot; , &quot;'&quot; , &quot;\nADID: &quot; , &quot;'&quot; , &quot; || orig_id || &quot; , &quot;'&quot; , &quot;\nRequest Type: Remove \nUser Type: &quot; , &quot;'&quot; , &quot; || type from fsod.fsod_user_all where user_id = a.user_id) ||
 (select &quot; , &quot;'&quot; , &quot;\nMarket/Location: &quot; , &quot;'&quot; , &quot; || atr.display_name from fsod.fsod_user_entry_attribute_all eaa, fsod.fsod_attribute_all atr, fsod.fsod_attribute_type typ where eaa.entry_id = a.role_id and eaa.user_id = a.user_id and eaa.attribute_id = atr.attribute_id and atr.attribute_type_id = typ.attribute_type_id and eaa.group_id = atr.group_id and atr.group_id = a.group_id and upper(typ.name) = &quot; , &quot;'&quot; , &quot;MARKET&quot; , &quot;'&quot; , &quot; ) ||
 (select &quot; , &quot;'&quot; , &quot;\nRole: &quot; , &quot;'&quot; , &quot; || role_name from fsod.fsod_uac_user_roles where rowid = a.rowid) ||
 (select &quot; , &quot;'&quot; , &quot; \n Access end date: &quot; , &quot;'&quot; , &quot;||to_char(end_date,&quot; , &quot;'&quot; , &quot;MM-DD-YYYY&quot; , &quot;'&quot; , &quot;) from fsod.fsod_uac_tests where uac_id = a.uac_id)&quot;))]</value>
      <webElementGuid>a2bd8945-2e4f-42ce-aa31-7392bd224b25</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//td[@id='oItemsApiIg_ig_grid_vc_cur']</value>
      <webElementGuid>2e4de08b-3f87-40a7-89ee-f1351eade6ce</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='oItemsApiIg_ig_grid_vc']/div[2]/div[4]/table/tbody/tr[10]/td[6]</value>
      <webElementGuid>652cc77a-0ea1-4016-808f-0a45f0067ed5</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='description'])[1]/following::td[1]</value>
      <webElementGuid>01c57350-02ed-4f6a-b669-1ed9439dfdb8</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='FSOD.FSOD_UAC_USER_ROLES (TABLE)'])[10]/following::td[3]</value>
      <webElementGuid>030195ca-ed2c-49ad-9e5b-1030f2f53848</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='-'])[19]/preceding::td[1]</value>
      <webElementGuid>4615684c-8b42-4d3c-a67f-ed862e4f0104</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='-'])[20]/preceding::td[3]</value>
      <webElementGuid>72e452d7-ae1b-4665-8abd-9f405e2b5096</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//tr[10]/td[6]</value>
      <webElementGuid>692dea1b-5aa9-4c0b-a489-ad85080d7fb9</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
