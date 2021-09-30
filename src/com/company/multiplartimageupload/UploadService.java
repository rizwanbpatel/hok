package com.company.multiplartimageupload;

public class UploadService {

//
//    @RequestMapping(value = "/upload-image", method = RequestMethod.POST)
//    public ResponseEntity uploadImages(HttpServletRequest servletRequest, @ModelAttribute MultiImage multiImage, Model model) {
//        //Get the uploaded images and store them
//        List<MultipartFile> images = multiImage.getImages();
//        List<String> fileNames = new ArrayList<String>();
//        if (null != images && images.size() > 0)
//        {
//            for (MultipartFile multipartFile : images) {
//                String fileName = multipartFile.getOriginalFilename();
//                fileNames.add(fileName);
//                File imageFile = new File(servletRequest.getServletContext().getRealPath("/image"), fileName);
//                try
//                {
//                    multipartFile.transferTo(imageFile);
//                } catch (IOException e)
//                {
//                    e.printStackTrace();
//                }
//            }
//        }
//        model.addAttribute("images", images);
//        UploadResult uploadResult = new UploadResult("Success","Images Uploaded");
//        return ResponseEntity.Ok(uploadResult);
//    }
}
