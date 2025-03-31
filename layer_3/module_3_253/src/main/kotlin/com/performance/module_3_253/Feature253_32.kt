package com.performance.module_3_253

class Feature253UseCase0(
    private val repository: Feature253Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
