// var mytablejosn={"data": [{"合同名称": "Tiger Nixon", "起草时间": "System Architect", "操作": "$320,800"},{"合同名称": "Tiger Nixon", "起草时间": "System Architect", "操作": "$320,800"}]};
// $("#table_id").dataTable({
//         lengthMenu: [10, 20, 30, 40],//定义在每页显示记录数的select中显示的选项。
//         lengthChange: false,
//         processing: true,//是否显示表格加载状态，在数据量大的时候需要
//         destroy: true,//允许销毁替换，在表格重新查询时，可以自动销毁以前的data
//         paging: true,//分页
//         serverSide: true,//开启后端分页
//         height: 500,
//         pagingType: "full_numbers",//分页样式的类型
//         ordering: true,//是否启用排序
//         searching: true,//搜索
//
//         ajax: {
//             type: "POST",
//             url: "temphome/pending",
//             dataType: "json",
//             data: JSON.stringify(mytablejosn),
//             async: false
//         },
//         language: {
//             "lengthMenu": "10",//默认每页小时条数
//             "sZeroRecords": "没有匹配结果",
//             "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
//             "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
//             "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
//             "sInfoPostFix": "",
//             "sSearch": "搜索:",
//             "sUrl": "",
//             "sEmptyTable": "表中数据为空",
//             "sInfoThousands": ",",
//             "paginate": {
//                 "first": "首页",
//                 "previous": "上页",
//                 "next": "下页",
//                 "last": "末页",
//                 "processing": "正在处理中。。。"
//             },
//         },
//
//         columns: [//定义行数据字段
//             {data: '合同名称'},
//             {data: '起草时间'},
//             {data: '操作'},
//
//         ],
//         "buttons":['copy','excel','pdf','csv','print']
//         // columnDefs: [//自定义处理行数据，和行样式
//         //     {"width": "3%", "targets": 0},
//         //     {"width": "4%", "targets": 1},
//         //     {"width": "4%", "targets": 2},
//         //     {"width": "6%", "targets": 3},
//         //     {
//         //         "width": "5%", "targets": 4, "render": function (data, type, row, meta) {
//         //             var jzh = row.JZH;
//         //
//         //             return jzh + "号机组";
//         //         }
//         //     },
//         //     {
//         //         "width": "4%", "targets": 5, "render": function (data, type, row, meta) {
//         //             var gzorqx = row.GZORQX;
//         //             if (gzorqx != undefined && gzorqx == 1) {
//         //                 gzorqx = '故障';
//         //             } else {
//         //                 gzorqx = '缺陷';
//         //             }
//         //             return gzorqx;
//         //         }
//         //     },
//         //     {"width": "4%", "targets": 6},
//         //     {"width": "4%", "targets": 7},
//         //     {
//         //         "width": "5%", "targets": 8, "render": function (data, type, row, meta) {
//         //             var sbxh = row.SBXH;
//         //             var fullsbxh = "";
//         //             if (sbxh != undefined && sbxh.length > 10) {
//         //                 var fullsbxh = row.SBXH;
//         //                 sbxh = sbxh.substring(1, 10);
//         //             } else {
//         //                 sbxh = "";
//         //             }
//         //             return "<label  data-toggle='tooltip' data-placement='top' title='" + fullsbxh + "'>" + sbxh + "</label>";
//         //         }
//         //     },
//         //
//         //
//         //     {"width": "5%", "targets": 9},
//         //     {
//         //         "width": "8%", "targets": 10, "render": function (data, type, row, meta) {
//         //             var gzlx = row.GZLX;
//         //             if (gzlx != undefined && gzlx.length > 10) {
//         //                 gzlx = gzlx.substring(1, 10);
//         //             }
//         //             return gzlx;
//         //         }
//         //     },
//         //     {
//         //         "width": "8%", "targets": 11, "render": function (data, type, row, meta) {
//         //             var gzyy = row.GZYY;
//         //             if (gzyy != undefined && gzyy.length > 10) {
//         //                 gzyy = gzyy.substring(1, 10);
//         //             }
//         //             return "<label  data-toggle='tooltip' data-placement='top' title='" + row.GZYY + "'>" + gzyy + "</label>";
//         //         }
//         //     },
//         //     {
//         //         "width": "8%", "targets": 12, "render": function (data, type, row, meta) {
//         //             var gzwz = row.GZWZ;
//         //             if (gzwz != undefined && gzwz.length > 10) {
//         //                 gzwz = gzwz.substring(1, 10);
//         //             }
//         //             return "<label  data-toggle='tooltip' data-placement='top' title='" + row.GZWZ + "'>" + gzwz + "</label>";
//         //         }
//         //     },
//         //     {
//         //         "width": "8%", "targets": 13, "render": function (data, type, row, meta) {
//         //             var gjz = row.GJZ;
//         //             if (gjz != undefined && gjz.length > 10) {
//         //                 gjz = gjz.substring(1, 10);
//         //             }
//         //             return "<label  data-toggle='tooltip' data-placement='top' title='" + row.GJZ + "'>" + gjz + "</label>";
//         //         }
//         //     },
//         //     {
//         //         "width": "8%", "targets": 14, "render": function (data, type, row, meta) {
//         //             var gzxx = row.GZXX;
//         //             if (gzxx != undefined && gzxx.length > 10) {
//         //                 gzxx = gzxx.substring(1, 10);
//         //             }
//         //             return "<label  data-toggle='tooltip' data-placement='top' title='" + row.GZXX + "'>" + gzxx + "</label>";
//         //         }
//         //     },
//         //
//         //     {
//         //         //   指定第四列，从0开始，0表示第一列，1表示第二列……
//         //         "width": "6%",
//         //         "targets": 15,
//         //         "render": function (data, type, row, meta) {
//         //             var rowIndex = meta.row;//获取到该行的rowIndex
//         //             var gzbh = row.GZBH;
//         //             return "<div style='display:inline-block; cursor:pointer;' data-toggle='modal' data-target='#exampleModalDCupdate'  class='edit' onclick = 'info.bjclick(" + rowIndex + ")'   class='edit' title='编辑'><span class='iconfont icon-bianji'></span></div>" +
//         //                 "&nbsp&nbsp <div style='display:inline-block; cursor:pointer;' onclick = 'info.scclick(this)' onespt = '" + row.GZBH + "' class='delete' title='删除'><span class='iconfont icon-lajitong'></span></div>" +
//         //                 "&nbsp&nbsp<div style='display:inline-block; cursor:pointer;' data-toggle='modal' data-target='#exampleModalGZfile' οnclick=openWindow('"+gzbh+"',2)   class='file_manage' title='文件管理'>" +
//         //                 "<span class='iconfont icon-wenjianjia' style='font-size:18px;'></span></div>"
//         //         }
//         //     }]
//
//
//     });
