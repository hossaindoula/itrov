<#import "../template/guest_layout.ftl" as layout>
<@layout.gen_app_layout "${PageTitle}" >
	<section id="content">
				<div class="container">
					<div class="mainbody ">
						<div class="row ">
							<div class="span12">
								<h1 class="page-title"><?php echo $title; ?></h1>
								<h2 class="subtitle"><?php echo $subtitle; ?></h2>
								
								<p style="text-align: justify;">
									<img class="alignleft size-full wp-image-110" alt="aboutus" src="http://hogash-demo.com/kallyas_wp/wp-content/uploads/2013/02/aboutus.jpg" width="200" height="134" />
									Originally named Fraternal Systems, It Rovers's history began with four Harvard Business School students creating the first database to store member contact information for their fraternity. Their computer program enabled fraternities to automate communication with their expanding member base. Once word spread that contact information could be stored on a database, Fraternal Systems began working with various non-profits to do the same for their fundraising efforts.

								</p>
								
							</div>
						</div>
					</div>
				</div>
			</section>
</@layout.gen_app_layout>