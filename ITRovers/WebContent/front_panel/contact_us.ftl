<#import "{rc.getContextPath()}/template/guest_layout.ftl" as layout>
<@layout.gen_app_layout "${PageTitle}" >
	<section id="content">
				<div class="container">
					<div class="mainbody ">
						<div class="row ">
							<div class="span12">
								<h1 class="page-title"><?php echo $title; ?></h1>
								<h2 class="subtitle"><?php echo $subtitle; ?></h2>
								
								<div class="span6">
									<p>Use this form to send us a message:</p>			
									<div id="contact_form" class="rapid_contact ">
										<form  method="post" class="cf_validate form-horizontal zn_form">
											<div id="success"></div>
												<div class="control-group ">
												<label class="control-label" for="Name">Name</label>
												<div class="controls">
												<input id="Name" type="text" name="Name" placeholder="Name" class="input-xlarge zn_required_field " title="Name" />
												</div>
												</div>
												<!-- end control group -->
												<div class="control-group ">
												<label class="control-label" for="Email">Email</label>
												<div class="controls">
												<input id="Email" type="text" name="Email" placeholder="Email" class="input-xlarge zn_required_field zn_email_field" title="Email" />
												</div>
												</div>
												<!-- end control group -->
												<div class="control-group ">
												<label class="control-label" for="Subject">Subject</label>
												<div class="controls">
												<input id="Subject" type="text" name="Subject" placeholder="Subject" class="input-xlarge zn_required_field " title="Subject" />
												</div>
												</div>
												<!-- end control group -->
												<div class="control-group ">
												<label class="control-label" for="Message">Message</label>
												<div class="controls">
												<textarea id="Message" name="Message" placeholder="Message" class=" textarea span4 zn_required_field " title="Message" ></textarea> 
												</div>
												</div>
												<!-- end control group -->				
												<input type="hidden" name="cform_submit" value="cf_submitted" />
												<div class="control-group">
													<div class="controls">
														<input class=" btn " id="submit-form" type="submit" name="submit" value="Send Message" />
													</div>
												</div>
												<!-- end control group -->
										</form> 
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</section>
</@layout.gen_app_layout>