<#import "../template/admin_layout.ftl" as layout>
<@layout.admin_layout "${PageTitle}" >



<div class="rightpanel">

<ul class="breadcrumbs">
    <li><a href="dashboard.html"><i class="iconfa-home"></i></a> <span class="separator"></span></li>
    <li>${PageTitle}</li>
    <li class="right">
        <a href="" data-toggle="dropdown" class="dropdown-toggle"><i class="icon-tint"></i> Color Skins</a>
        <ul class="dropdown-menu pull-right skin-color">
            <li><a href="default">Default</a></li>
            <li><a href="navyblue">Navy Blue</a></li>
            <li><a href="palegreen">Pale Green</a></li>
            <li><a href="red">Red</a></li>
            <li><a href="green">Green</a></li>
            <li><a href="brown">Brown</a></li>
        </ul>
    </li>
</ul>

<div class="pageheader">
    <form action="results.html" method="post" class="searchbar">
        <input type="text" name="keyword" placeholder="To search type and hit enter..." />
    </form>
    <div class="pageicon"><span class="iconfa-laptop"></span></div>
    <div class="pagetitle">
        <h5>All Features Summary</h5>
        <h1>${PageTitle}</h1>
    </div>
</div><!--pageheader-->

<div class="maincontent">
<div class="maincontentinner">
<div class="row-fluid">
<div id="dashboard-left" class="span8">

    <h5 class="subtitle">Recently Viewed Pages</h5>
    <ul class="shortcuts">
        <li class="events">
            <a href="contentHeaderList.itr">
                <span class="shortcuts-icon iconsi-event"></span>
                <span class="shortcuts-label">modify1</span>
            </a>
        </li>
        <li class="prodects">
            <a href="createContentheader.itr">
                <span class="shortcuts-icon iconsi-cart"></span>
                <span class="shortcuts-label">modify2</span>
            </a>
        </li>
    </ul>

    <br />


    <div class="divider30"></div>

    <br />

    <h4 class="widgettitle"><span class="icon-comment icon-white"></span> Recent Comments</h4>
    <div class="widgetcontent nopadding">
        <ul class="commentlist">
            <li>
                <img src="images/photos/thumb2.png" alt="" class="pull-left" />
                <div class="comment-info">
                    <h4><a href="">Sed ut perspiciatis unde omnis iste natus error sit voluptatem</a></h4>
                    <h5>in <a href="">Sit Voluptatem</a></h5>
                    <p>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. </p>
                    <p>
                        <a href="" class="btn btn-success btn-small"><span class="icon-thumbs-up icon-white"></span> Approve</a>
                        <a href="" class="btn btn-small"><span class="icon-thumbs-down"></span> Reject</a>
                    </p>
                </div>
            </li>
            <li>
                <img src="images/photos/thumb1.png" alt="" class="pull-left" />
                <div class="comment-info">
                    <h4><a href="">But I must explain to you how all this mistaken</a></h4>
                    <h5>in <a href="">At vero eos et accusamus et iusto odio dignissimos</a></h5>
                    <p>Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae.</p>
                    <p>
                        <a href="" class="btn btn-success btn-small"><span class="icon-thumbs-up icon-white"></span> Approve</a>
                        <a href="" class="btn btn-small"><span class="icon-thumbs-down"></span> Reject</a>
                    </p>
                </div>
            </li>
            <li>
                <img src="images/photos/thumb10.png" alt="" class="pull-left" />
                <div class="comment-info">
                    <h4><a href="">On the other hand, we denounce with righteous indignation</a></h4>
                    <h5>in <a href="">These cases are perfectly simple and easy to distinguish</a></h5>
                    <p>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia.</p>
                    <p>
                        <a href="" class="btn btn-success btn-small"><span class="icon-thumbs-up icon-white"></span> Approve</a>
                        <a href="" class="btn btn-small"><span class="icon-thumbs-down"></span> Reject</a>
                    </p>
                </div>
            </li>
            <li><a href="">View More Comments</a></li>
        </ul>
    </div>

    <br />


</div><!--span8-->

<div id="dashboard-right" class="span4">

    <h5 class="subtitle">Announcements</h5>

    <div class="divider15"></div>

    <div class="alert alert-block">
        <button data-dismiss="alert" class="close" type="button">&times;</button>
        <h4>Warning!</h4>
        <p style="margin: 8px 0">Best check yo self, you're not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent commodo cursus magna.</p>
    </div><!--alert-->

    <br />

    <h5 class="subtitle">Summaries</h5>

    <div class="divider15"></div>

    <div class="tabbedwidget tab-primary">
        <ul>
            <li><a href="#tabs-1"><span class="iconfa-user"></span></a></li>
            <li><a href="#tabs-2"><span class="iconfa-star"></span></a></li>
            <li><a href="#tabs-3"><span class="iconfa-comments"></span></a></li>
        </ul>
        <div id="tabs-1" class="nopadding">
            <h5 class="tabtitle">Last Logged In Users</h5>
            <ul class="userlist">
                <li>
                    <div>
                        <img src="images/photos/thumb1.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Draniem Daamul</h5>
                            <span class="pos">Software Engineer</span>
                            <span>Last Logged In: 04/20/2013 8:40PM</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb2.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Therineka Chonpe</h5>
                            <span class="pos">Regional Manager</span>
                            <span>Last Logged In: 04/20/2013 3:30PM</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb3.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Zaham Sindilmaca</h5>
                            <span class="pos">Chief Technical Officer</span>
                            <span>Last Logged In: 04/19/2013 1:30AM</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb4.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Annie Cerona</h5>
                            <span class="pos">Engineering Manager</span>
                            <span>Last Logged In: 04/19/2013 11:30AM</span>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb5.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Delher Carasbong</h5>
                            <span class="pos">Software Engineer</span>
                            <span>Last Logged In: 04/19/2013 11:00AM</span>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
        <div id="tabs-2" class="nopadding">
            <h5 class="tabtitle">Favorites</h5>
            <ul class="userlist userlist-favorites">
                <li>
                    <div>
                        <img src="images/photos/thumb3.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Zaham Sindilmaca</h5>
                            <p class="link">
                                <a href=""><i class="iconfa-envelope"></i> Message</a>
                                <a href=""><i class="iconfa-phone"></i> Call</a>
                            </p>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb4.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Annie Cerona</h5>
                            <p class="link">
                                <a href=""><i class="iconfa-envelope"></i> Message</a>
                                <a href=""><i class="iconfa-phone"></i> Call</a>
                            </p>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb5.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Delher Carasbong</h5>
                            <p class="link">
                                <a href=""><i class="iconfa-envelope"></i> Message</a>
                                <a href=""><i class="iconfa-phone"></i> Call</a>
                            </p>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb1.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Draniem Daamul</h5>
                            <p class="link">
                                <a href=""><i class="iconfa-envelope"></i> Message</a>
                                <a href=""><i class="iconfa-phone"></i> Call</a>
                            </p>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb2.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Therineka Chonpe</h5>
                            <p class="link">
                                <a href=""><i class="iconfa-envelope"></i> Message</a>
                                <a href=""><i class="iconfa-phone"></i> Call</a>
                            </p>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
        <div id="tabs-3" class="nopadding">
            <h5 class="tabtitle">Top Comments</h5>
            <ul class="userlist">
                <li>
                    <div>
                        <img src="images/photos/thumb4.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Annie Cerona</h5>
                            <p class="par">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididun</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb5.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Delher Carasbong</h5>
                            <p class="par">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididun</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb1.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Draniem Daamul</h5>
                            <p class="par">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididun</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb2.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Therineka Chonpe</h5>
                            <p class="par">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididun</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <img src="images/photos/thumb3.png" alt="" class="pull-left" />
                        <div class="uinfo">
                            <h5>Zaham Sindilmaca</h5>
                            <p class="par">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididun</p>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div><!--tabbedwidget-->

    <br />

</div><!--span4-->
</div><!--row-fluid-->

<div class="footer">
    <div class="footer-left">
        <span>&copy; 2013. ITRovers PTY LTD. All Rights Reserved.</span>
    </div>
    <div class="footer-right">
        <span>ITRovers</span>
    </div>
</div><!--footer-->

</div><!--maincontentinner-->
</div><!--maincontent-->

</div><!--rightpanel-->

</@layout.admin_layout>