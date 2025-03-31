package com.performance.module_4_279

class Feature279UseCase1(
    private val repository: Feature279Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
